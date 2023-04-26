package com.wirecard.challenge.entities

import com.wirecard.challenge.dtos.BuyerDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "buyers")
data class Buyer(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val email: String,
    val cpf: String
) {
    fun toDto() = BuyerDto(
        name = this.name,
        email = this.email,
        cpf = this.cpf
    )
}