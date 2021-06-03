package br.com.hr.payroll.feign

import br.com.hr.payroll.model.Employee
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Component
@FeignClient(name = "hr-employee-service", path = "/employees")
interface EmployeeFeignClient {
    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): ResponseEntity<Employee>
}