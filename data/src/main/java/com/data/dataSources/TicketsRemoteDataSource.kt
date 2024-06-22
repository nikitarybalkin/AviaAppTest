package com.data.dataSources

import com.example.domain.model.Tickets

interface TicketsRemoteDataSource {
    suspend fun getTickets(): Tickets
}