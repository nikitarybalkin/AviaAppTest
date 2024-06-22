package com.data.dataSources

import com.example.domain.entities.CityEntity
import kotlinx.coroutines.flow.Flow

interface CityLocalDataSource {
    fun getAll(): Flow<List<CityEntity>>

    suspend fun insert(table: CityEntity)

    suspend fun deleteAll()
}