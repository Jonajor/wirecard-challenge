package com.wirecard.challenge.dtos

import com.wirecard.challenge.entities.Client

data class ClientDto(
    val name: String,
    val email: String,
    val cpf: String
) {
    fun toDomain() = Client(
        name = this.name,
        email = this.email,
        cpf = this.cpf
    )
}