package com.wirecard.challenge.service

import com.wirecard.challenge.dtos.PaymentRequest
import com.wirecard.challenge.repositories.PaymentRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service

@Service
class PaymentService(private val paymentRepository: PaymentRepository) {

    fun processPayment(request: PaymentRequest) = paymentRepository.save(request.toDomain()).toDto()

    fun getPayment(id: Long) = paymentRepository.findById(id).takeIf {
                payment -> payment.isPresent
            }?.get()?.toDto() ?: throw NotFoundException()
}