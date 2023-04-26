package com.wirecard.challenge.dtos

import com.wirecard.challenge.enums.PaymentType
import java.math.BigDecimal

data class PaymentResponse(
    val id: Long,
    val amount: BigDecimal,
    val type: PaymentType,
    val card: CardDto? = null,
    val buyer: BuyerDto,
    val client: ClientDto,
    val successful: Boolean = true
)