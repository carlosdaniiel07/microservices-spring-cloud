package br.com.hr.payroll.services

import br.com.hr.payroll.feign.EmployeeFeignClient
import br.com.hr.payroll.model.Payment
import org.springframework.stereotype.Service

@Service
class PaymentService(val employeeFeignClient: EmployeeFeignClient) {
    fun payment(employeeId: Long, days: Int): Payment {
        val employee = employeeFeignClient.get(employeeId).body
        return Payment(employee!!.name, employee!!.dailyIncome, days)
    }
}