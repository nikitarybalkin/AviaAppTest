package com.example.aviaapp.presentation.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.CityUseCase
import com.example.domain.usecases.GetDataUseCase
import com.example.domain.usecases.OffersUseCase
import com.example.domain.usecases.SaveDataUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class MenuViewModel @Inject constructor(
    private val saveDataUseCase: SaveDataUseCase,
    private val getDataUseCase: GetDataUseCase,
    private val offersUseCase: OffersUseCase,
    private val cityUseCase: CityUseCase
) : ViewModel() {

    var offers: MutableStateFlow<com.example.domain.model.OffersModel?> = MutableStateFlow(null)
    var city: Flow<List<com.example.domain.model.CityModel?>> = MutableStateFlow(emptyList())
    fun saveData(key: String, value: String) {
        saveDataUseCase.saveData(key = key, value = value)
    }

    fun getData(key: String): String? {
        return getDataUseCase.getData(key = key)
    }

    fun insertCity(city: com.example.domain.model.CityModel) {
        viewModelScope.launch {
            cityUseCase.insert(city)
        }
    }

    fun getCity() {
        //Так как, в ТЗ не было указано где использовать БД и на hh.ru мне не ответили на этот вопрос, я реализовал БД, но нигде не использовал
        viewModelScope.launch {
            city = cityUseCase.getAll()
        }
    }

    fun getOffers() {

        viewModelScope.launch {
            try {
                offers.value = offersUseCase.getOffers()
            }
            catch (e: Exception) {
            }
        }



    }
}