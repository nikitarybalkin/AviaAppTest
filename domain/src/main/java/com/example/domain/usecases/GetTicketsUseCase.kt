package com.example.domain.usecases

import com.example.domain.repositories.TicketsRepository
import com.example.domain.model.TicketsModel
import javax.inject.Inject

class GetTicketsUseCase @Inject constructor(private val ticketsRepository: TicketsRepository) {
    suspend fun getTickets(): TicketsModel {
        return ticketsRepository.getTickets()
    }
}