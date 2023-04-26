package com.wirecard.challenge.dtos

import com.wirecard.challenge.entities.Buyer

data class BuyerDto(
    val name: String,
    val email: String,
    val cpf: String
) {
    fun toDomain() = Buyer(
        name = this.name,
        email = this.email,
        cpf = this.cpf
    )
}