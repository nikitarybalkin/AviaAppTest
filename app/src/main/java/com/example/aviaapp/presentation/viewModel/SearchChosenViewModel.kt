package com.example.aviaapp.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.GetTicketsUseCase
import com.example.domain.model.TicketsModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class SearchChosenViewModel @Inject constructor(
    private val getTicketsUseCase: GetTicketsUseCase,
) : ViewModel() {

    var tickets: MutableStateFlow<TicketsModel?> = MutableStateFlow(null)
    var name_from_where: String? = null
    var name_to_where: String? = null

    fun getTickets() {
        viewModelScope.launch {
            try {
                tickets.value = getTicketsUseCase.getTickets()
            } catch (e: Exception) {
            }
        }

    }

}