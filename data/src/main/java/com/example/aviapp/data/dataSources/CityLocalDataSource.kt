package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.model.CityEntity
import kotlinx.coroutines.flow.Flow

interface CityLocalDataSource {
    fun getAll(): Flow<List<CityEntity>>

    suspend fun insert(table: CityEntity)

    suspend fun deleteAll()
}