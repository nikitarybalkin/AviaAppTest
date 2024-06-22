package com.data.dataSources

import com.data.api.AllTicketsAPI
import com.example.domain.model.AllTickets
import javax.inject.Inject

class AllTicketsRemoteDataSourceImpl @Inject constructor(private val api: AllTicketsAPI):
    AllTicketsRemoteDataSource {
    override suspend fun getAllTickets(): AllTickets {
        return api.getAllTickets()
    }


}