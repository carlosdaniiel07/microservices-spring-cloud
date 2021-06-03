package br.com.hr.payroll.services

import br.com.hr.payroll.model.Payment
import org.springframework.stereotype.Service

@Service
class PaymentService {
    fun payment(employeeId: Long, days: Int): Payment {
        return Payment("Test", 200.0, days)
    }
}