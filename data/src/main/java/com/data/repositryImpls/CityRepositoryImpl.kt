package com.data.repositryImpls

import com.data.dataSources.CityLocalDataSource
import com.example.domain.model.CityModel
import com.example.domain.model.mapToData
import com.example.domain.model.mapToDomain
import com.example.domain.repositories.CityRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CityRepositoryImpl @Inject constructor(private val cityLocalDataSource: CityLocalDataSource):
    CityRepository {
    override fun getAll(): Flow<List<CityModel>> {
        return cityLocalDataSource.getAll().map { list ->  list.map { it.mapToDomain() }}
    }

    override suspend fun insert(table: CityModel) {
        cityLocalDataSource.insert(table.mapToData())
    }

    override suspend fun deleteAll() {
        cityLocalDataSource.deleteAll()
    }
}