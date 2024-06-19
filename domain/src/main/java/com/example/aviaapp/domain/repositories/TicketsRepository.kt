package com.example.aviaapp.domain.repositories

import com.example.aviaapp.domain.model.TicketsModel

interface TicketsRepository {
    suspend fun getTickets(): TicketsModel
}