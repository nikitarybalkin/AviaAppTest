package com.example.domain.repositories

import com.example.domain.model.OffersModel

interface OffersRepository {
    suspend fun getOffers(): OffersModel
}