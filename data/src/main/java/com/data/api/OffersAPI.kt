package com.data.api

import com.example.domain.model.Offers
import retrofit2.http.GET

interface OffersAPI {

    @GET("/v3/ad9a46ba-276c-4a81-88a6-c068e51cce3a")
    suspend fun getOffers(): Offers
}