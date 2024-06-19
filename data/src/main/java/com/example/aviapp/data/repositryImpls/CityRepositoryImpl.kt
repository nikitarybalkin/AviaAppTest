package com.example.aviapp.data.repositryImpls

import com.example.aviaapp.domain.model.CityModel
import com.example.aviaapp.domain.model.mapToData
import com.example.aviaapp.domain.model.mapToDomain
import com.example.aviaapp.domain.repositories.CityRepository
import com.example.aviapp.data.dataSources.CityLocalDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CityRepositoryImpl @Inject constructor(private val cityLocalDataSource: CityLocalDataSource): CityRepository {
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