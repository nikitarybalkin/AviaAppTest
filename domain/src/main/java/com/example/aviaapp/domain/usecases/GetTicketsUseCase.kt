package com.example.aviaapp.domain.usecases

import com.example.aviaapp.domain.repositories.TicketsRepository
import com.example.aviaapp.domain.model.TicketsModel
import javax.inject.Inject

class GetTicketsUseCase @Inject constructor(private val ticketsRepository: TicketsRepository) {
    suspend fun getTickets(): TicketsModel {
        return ticketsRepository.getTickets()
    }
}