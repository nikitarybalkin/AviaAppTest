package com.example.aviaapp.domain.usecases

import com.example.aviaapp.domain.repositories.SharedPreferenceRepository
import javax.inject.Inject

class GetDataUseCase @Inject constructor(private val repository: SharedPreferenceRepository) {

    fun getData(key: String): String? {
        return repository.getData(key = key)
    }

}