package com.example.domain.usecases

import com.example.domain.model.AllTicketsModel
import com.example.domain.repositories.AllTicketsRepository
import javax.inject.Inject

class GetAllTicketsUseCase @Inject constructor(private val allTicketsRepository: AllTicketsRepository) {

    suspend fun getAllTickets(): AllTicketsModel {
        return allTicketsRepository.getAllTickets()
    }
}