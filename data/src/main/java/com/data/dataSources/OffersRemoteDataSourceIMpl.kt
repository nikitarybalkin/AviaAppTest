package com.data.dataSources

import com.data.api.OffersAPI
import com.example.domain.model.Offers
import javax.inject.Inject

class OffersRemoteDataSourceIMpl @Inject constructor(private val api: OffersAPI):
    OffersRemoteDataSource {
    override suspend fun getOffers(): Offers {
        return api.getOffers()
    }


}