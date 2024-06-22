package com.data.api

import com.example.domain.model.Tickets
import retrofit2.http.GET

interface TicketsAPI {

    @GET("/v3/38b5205d-1a3d-4c2f-9d77-2f9d1ef01a4a")
    suspend fun getTickets(): Tickets
}