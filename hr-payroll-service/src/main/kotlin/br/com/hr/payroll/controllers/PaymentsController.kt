package br.com.hr.payroll.controllers

import br.com.hr.payroll.model.Payment
import br.com.hr.payroll.services.PaymentService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentsController(val service: PaymentService) {
    @GetMapping("/{employeeId}/days/{days}")
    fun getPayment(@PathVariable employeeId: Long, @PathVariable days: Int): ResponseEntity<Payment> {
        return  ResponseEntity.ok(service.payment(employeeId, days))
    }
}