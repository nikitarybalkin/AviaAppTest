package com.example.domain.usecases

import com.example.domain.repositories.SharedPreferenceRepository
import javax.inject.Inject

class SaveDataUseCase @Inject constructor (private val repository: SharedPreferenceRepository) {

    fun saveData(key: String, value: String) {
        repository.saveData(key = key, value = value)
    }

}