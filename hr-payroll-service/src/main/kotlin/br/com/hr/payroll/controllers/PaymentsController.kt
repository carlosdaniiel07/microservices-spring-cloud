package br.com.hr.payroll.controllers

import br.com.hr.payroll.exceptions.ServiceUnavailableException
import br.com.hr.payroll.model.Payment
import br.com.hr.payroll.services.PaymentService
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentsController(val service: PaymentService) {

    @HystrixCommand(fallbackMethod = "getPaymentFallback")
    @GetMapping("/{employeeId}/days/{days}")
    fun getPayment(@PathVariable employeeId: Long, @PathVariable days: Int): ResponseEntity<Payment> {
        return  ResponseEntity.ok(service.payment(employeeId, days))
    }

    fun getPaymentFallback(employeeId: Long, days: Int): ResponseEntity<Payment> {
        throw ServiceUnavailableException()
    }
}