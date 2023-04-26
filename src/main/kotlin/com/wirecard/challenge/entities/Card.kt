package com.wirecard.challenge.entities

import com.wirecard.challenge.dtos.CardDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "cards")
data class Card(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val holderName: String,
    val number: String,
    val expirationDate: String,
    val cvv: String
) {
    fun toDto() = CardDto(
        holderName = this.holderName,
        number = this.number,
        expirationDate = LocalDate.parse(expirationDate),
        cvv = this.cvv
    )
}