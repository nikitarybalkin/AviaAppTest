package com.data.dataSources

import com.data.dao.CityDao
import com.example.domain.entities.CityEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CityLocalDataSourceImpl @Inject constructor(private val cityDao: CityDao):
    CityLocalDataSource {
    override fun getAll(): Flow<List<CityEntity>> {
        return cityDao.getAll()
    }

    override suspend fun insert(table: CityEntity) {
        return cityDao.insert(table)
    }

    override suspend fun deleteAll() {
        cityDao.deleteAll()
    }

}