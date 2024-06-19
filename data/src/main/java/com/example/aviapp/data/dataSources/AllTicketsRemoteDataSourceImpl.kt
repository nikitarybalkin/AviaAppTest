package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.apiModel.model.AllTickets
import com.example.aviapp.data.api.AllTicketsAPI
import javax.inject.Inject

class AllTicketsRemoteDataSourceImpl @Inject constructor(private val api: AllTicketsAPI):
    AllTicketsRemoteDataSource {
    override suspend fun getAllTickets(): AllTickets {
        return api.getAllTickets()
    }


}