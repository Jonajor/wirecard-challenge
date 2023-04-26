package com.wirecard.challenge.dtos

import com.wirecard.challenge.entities.Card
import java.time.LocalDate

data class CardDto(
    val holderName: String,
    val number: String,
    val expirationDate: LocalDate,
    val cvv: String
) {
    fun toDomain() = Card(
        holderName = this.holderName,
        number = this.number,
        expirationDate = this.expirationDate.toString(),
        cvv = this.cvv
    )
}