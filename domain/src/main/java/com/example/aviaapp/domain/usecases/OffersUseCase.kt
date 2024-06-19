package com.example.aviaapp.domain.usecases

import com.example.aviaapp.domain.model.OffersModel
import com.example.aviaapp.domain.repositories.OffersRepository
import javax.inject.Inject

class OffersUseCase @Inject constructor(private val offersRepository: OffersRepository) {

    suspend fun getOffers(): OffersModel {

        return offersRepository.getOffers()

    }

}