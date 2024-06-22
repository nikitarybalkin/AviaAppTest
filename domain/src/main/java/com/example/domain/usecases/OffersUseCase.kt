package com.example.domain.usecases

import com.example.domain.model.OffersModel
import com.example.domain.repositories.OffersRepository
import javax.inject.Inject

class OffersUseCase @Inject constructor(private val offersRepository: OffersRepository) {

    suspend fun getOffers(): OffersModel {

        return offersRepository.getOffers()

    }

}