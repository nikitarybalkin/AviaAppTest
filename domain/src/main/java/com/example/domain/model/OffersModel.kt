package com.example.domain.model


class OffersModel (
    val offers: List<Offer>
)
fun Offers.mapToDomain() = OffersModel(
    offers
)
fun OffersModel.mapToData() = Offers(
    offers
)
