package com.wirecard.challenge.controllers

import com.wirecard.challenge.dtos.PaymentRequest
import com.wirecard.challenge.service.PaymentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController(private val paymentService: PaymentService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createPayment(@RequestBody request: PaymentRequest)= paymentService.processPayment(request)


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getPayment(@PathVariable id: Long) = paymentService.getPayment(id)
}

