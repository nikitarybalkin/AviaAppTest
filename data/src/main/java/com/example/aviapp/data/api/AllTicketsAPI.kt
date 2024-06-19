package com.example.aviapp.data.api

import com.example.aviaapp.domain.apiModel.model.AllTickets

interface AllTicketsAPI {

    suspend fun getAllTickets(): AllTickets
}