package com.data.repositryImpls

import com.data.dataSources.TicketsRemoteDataSource
import com.example.domain.repositories.TicketsRepository
import com.example.domain.model.TicketsModel
import com.example.domain.model.mapToDomain
import javax.inject.Inject

class TicketsRepositoryImpl @Inject constructor(private val ticketsRemoteDataSource: TicketsRemoteDataSource) :
    TicketsRepository {
    override suspend fun getTickets(): TicketsModel {
        return ticketsRemoteDataSource.getTickets().mapToDomain()
    }

}