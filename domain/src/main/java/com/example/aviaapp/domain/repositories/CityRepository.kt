package com.example.aviaapp.domain.repositories

import com.example.aviaapp.domain.model.CityModel
import kotlinx.coroutines.flow.Flow

interface CityRepository {
    fun getAll(): Flow<List<CityModel>>
    suspend fun insert(table: CityModel)
    suspend fun deleteAll()
}