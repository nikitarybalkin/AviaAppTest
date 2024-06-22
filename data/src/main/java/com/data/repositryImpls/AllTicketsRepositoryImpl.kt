package com.data.repositryImpls

import com.data.dataSources.AllTicketsRemoteDataSource
import com.example.domain.repositories.AllTicketsRepository
import com.example.domain.model.AllTicketsModel
import com.example.domain.model.mapToDomain
import javax.inject.Inject

class AllTicketsRepositoryImpl @Inject constructor(private val allTicketsRemoteDataSource: AllTicketsRemoteDataSource):
    AllTicketsRepository {
    override suspend fun getAllTickets(): AllTicketsModel {
        return allTicketsRemoteDataSource.getAllTickets().mapToDomain()
    }
}