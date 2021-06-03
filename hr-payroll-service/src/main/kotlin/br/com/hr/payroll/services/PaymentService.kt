package br.com.hr.payroll.services

import br.com.hr.payroll.model.Employee
import br.com.hr.payroll.model.Payment
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PaymentService(val restTemplate: RestTemplate, @Value("\${hr-employee.host}") private val employeeHost: String) {
    fun payment(employeeId: Long, days: Int): Payment {
        var urlParams = HashMap<String, Long>()

        urlParams["id"] = employeeId

        val employee = restTemplate.getForObject("${employeeHost}/employees/{id}", Employee::class.java, urlParams)

        return Payment(employee!!.name, employee.dailyIncome, days)
    }
}