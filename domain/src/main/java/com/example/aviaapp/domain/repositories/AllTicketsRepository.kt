package com.example.aviaapp.domain.repositories

import com.example.aviaapp.domain.model.AllTicketsModel

interface AllTicketsRepository {
    suspend fun getAllTickets(): AllTicketsModel
}