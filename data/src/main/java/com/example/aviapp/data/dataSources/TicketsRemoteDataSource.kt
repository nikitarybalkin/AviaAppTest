package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.apiModel.model.Tickets

interface TicketsRemoteDataSource {
    suspend fun getTickets(): Tickets
}