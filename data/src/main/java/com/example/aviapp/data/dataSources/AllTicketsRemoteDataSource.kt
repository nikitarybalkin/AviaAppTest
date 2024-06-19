package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.apiModel.model.AllTickets

interface AllTicketsRemoteDataSource {

    suspend fun getAllTickets(): AllTickets
}