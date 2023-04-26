package com.wirecard.challenge.entities

import com.wirecard.challenge.enums.PaymentType
import com.wirecard.challenge.dtos.PaymentResponse
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "payments")
data class Payment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val amount: BigDecimal,
    @Enumerated(EnumType.STRING)
    val type: PaymentType,
    @OneToOne(cascade = [CascadeType.ALL])
    val card: Card? = null,
    @ManyToOne(cascade = [CascadeType.ALL])
    val buyer: Buyer,
    @ManyToOne(cascade = [CascadeType.ALL])
    val client: Client,
    val successful: Boolean = true
) {
    fun toDto() = PaymentResponse(
        id = this.id,
        amount = this.amount,
        type = this.type,
        card = this.card?.toDto(),
        buyer = this.buyer.toDto(),
        client = this.client.toDto(),
        successful = this.successful
    )
}