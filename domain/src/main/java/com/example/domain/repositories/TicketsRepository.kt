package com.example.domain.repositories

import com.example.domain.model.TicketsModel

interface TicketsRepository {
    suspend fun getTickets(): TicketsModel
}