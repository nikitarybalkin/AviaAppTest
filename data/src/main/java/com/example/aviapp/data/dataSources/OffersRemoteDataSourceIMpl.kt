package com.example.aviapp.data.dataSources

import com.example.aviaapp.domain.apiModel.model.Offers
import com.example.aviapp.data.api.OffersAPI
import javax.inject.Inject

class OffersRemoteDataSourceIMpl @Inject constructor(private val api: OffersAPI):
    OffersRemoteDataSource {
    override suspend fun getOffers(): Offers {
        return api.getOffers()
    }


}