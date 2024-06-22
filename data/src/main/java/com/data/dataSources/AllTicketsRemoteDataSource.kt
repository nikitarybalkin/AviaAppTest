package com.data.dataSources

import com.example.domain.model.AllTickets

interface AllTicketsRemoteDataSource {

    suspend fun getAllTickets(): AllTickets
}