package com.wirecard.challenge.dtos

import com.wirecard.challenge.entities.Payment
import com.wirecard.challenge.enums.PaymentType
import java.math.BigDecimal

data class PaymentRequest(
    val amount: BigDecimal,
    val type: PaymentType,
    val card: CardDto? = null,
    val buyer: BuyerDto,
    val client: ClientDto,
    val successful: Boolean = true
) {
    fun toDomain() = Payment(
        amount = this.amount,
        type = this.type,
        card = this.card?.toDomain(),
        buyer = this.buyer.toDomain(),
        client = this.client.toDomain(),
        successful = this.successful
    )
}
