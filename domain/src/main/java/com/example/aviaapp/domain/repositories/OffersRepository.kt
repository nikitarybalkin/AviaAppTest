package com.example.aviaapp.domain.repositories

import com.example.aviaapp.domain.model.OffersModel

interface OffersRepository {
    suspend fun getOffers(): OffersModel
}