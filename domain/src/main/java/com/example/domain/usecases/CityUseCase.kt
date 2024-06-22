package com.example.domain.usecases

import com.example.domain.model.CityModel
import com.example.domain.repositories.CityRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CityUseCase @Inject constructor(private val repository: CityRepository) {
    fun getAll(): Flow<List<CityModel>> {
        return repository.getAll()
    }

    suspend fun insert(table: CityModel) {
        repository.insert(table)
    }

    suspend fun deleteAll() {
        repository.deleteAll()
    }
}