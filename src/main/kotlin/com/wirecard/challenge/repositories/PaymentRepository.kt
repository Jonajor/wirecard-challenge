package com.wirecard.challenge.repositories

import com.wirecard.challenge.entities.Payment
import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository<Payment, Long> {}