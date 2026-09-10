package com.stripe.payments.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stripe.payments.pojo.PaymentRequest;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/payments")
@Slf4j
public class PaymentController {

	@PostMapping
	public String PaymentController(@Valid @RequestBody PaymentRequest paymentRequest) {
		
		log.info("Creating payment... PaymentRequest: {}", paymentRequest);
		return "Payment created successfully PaymentRequest: " + paymentRequest;
	}
	
}
