package com.example.aviaapp.domain.usecases

import com.example.aviaapp.domain.repositories.SharedPreferenceRepository
import javax.inject.Inject

class SaveDataUseCase @Inject constructor (private val repository: SharedPreferenceRepository) {

    fun saveData(key: String, value: String) {
        repository.saveData(key = key, value = value)
    }

}