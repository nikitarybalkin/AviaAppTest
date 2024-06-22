package com.example.domain.repositories

import com.example.domain.model.AllTicketsModel

interface AllTicketsRepository {
    suspend fun getAllTickets(): AllTicketsModel
}