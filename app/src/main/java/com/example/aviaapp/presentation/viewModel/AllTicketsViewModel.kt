package com.example.aviaapp.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.AllTicketsModel
import com.example.domain.usecases.GetAllTicketsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class AllTicketsViewModel @Inject constructor(private val getAllTicketsUseCase: GetAllTicketsUseCase): ViewModel() {

    var allTicketsModel: MutableStateFlow<AllTicketsModel?> = MutableStateFlow(null)
    fun getAllTickets() {
        viewModelScope.launch {
            try {
                allTicketsModel.value = getAllTicketsUseCase.getAllTickets()
            }
            catch (e: Exception) {}
        }
    }
}