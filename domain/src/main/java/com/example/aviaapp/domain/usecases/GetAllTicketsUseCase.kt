package com.example.aviaapp.domain.usecases

import com.example.aviaapp.domain.model.AllTicketsModel
import com.example.aviaapp.domain.repositories.AllTicketsRepository
import javax.inject.Inject

class GetAllTicketsUseCase @Inject constructor(private val allTicketsRepository: AllTicketsRepository) {

    suspend fun getAllTickets(): AllTicketsModel {
        return allTicketsRepository.getAllTickets()
    }
}