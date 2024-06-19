package com.example.aviaapp.domain.model


import com.example.aviaapp.domain.apiModel.model.Offer
import com.example.aviaapp.domain.apiModel.model.Offers

class OffersModel (
    val offers: List<Offer>
)
fun Offers.mapToDomain() = OffersModel(
    offers
)
fun OffersModel.mapToData() = Offers(
    offers
)
