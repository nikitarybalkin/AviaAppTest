package com.example.aviapp.data.repositryImpls

import com.example.aviaapp.domain.repositories.AllTicketsRepository
import com.example.aviaapp.domain.model.AllTicketsModel
import com.example.aviaapp.domain.model.mapToDomain
import com.example.aviapp.data.dataSources.AllTicketsRemoteDataSource
import javax.inject.Inject

class AllTicketsRepositoryImpl @Inject constructor(private val allTicketsRemoteDataSource: AllTicketsRemoteDataSource):
    AllTicketsRepository {
    override suspend fun getAllTickets(): AllTicketsModel {
        return allTicketsRemoteDataSource.getAllTickets().mapToDomain()
    }
}