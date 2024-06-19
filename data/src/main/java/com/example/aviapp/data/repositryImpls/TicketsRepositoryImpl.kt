package com.example.aviapp.data.repositryImpls

import com.example.aviaapp.domain.repositories.TicketsRepository
import com.example.aviaapp.domain.model.TicketsModel
import com.example.aviaapp.domain.model.mapToDomain
import com.example.aviapp.data.dataSources.TicketsRemoteDataSource
import javax.inject.Inject

class TicketsRepositoryImpl @Inject constructor(private val ticketsRemoteDataSource: TicketsRemoteDataSource) :
    TicketsRepository {
    override suspend fun getTickets(): TicketsModel {
        return ticketsRemoteDataSource.getTickets().mapToDomain()
    }

}