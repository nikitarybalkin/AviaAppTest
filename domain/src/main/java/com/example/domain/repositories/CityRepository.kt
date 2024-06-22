package com.example.domain.repositories

import com.example.domain.model.CityModel
import kotlinx.coroutines.flow.Flow

interface CityRepository {
    fun getAll(): Flow<List<CityModel>>
    suspend fun insert(table: CityModel)
    suspend fun deleteAll()
}