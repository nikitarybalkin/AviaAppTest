package com.data.api

import com.example.domain.model.AllTickets
import retrofit2.http.GET

interface AllTicketsAPI {

    @GET("/v3/c0464573-5a13-45c9-89f8-717436748b69")
    suspend fun getAllTickets(): AllTickets
}