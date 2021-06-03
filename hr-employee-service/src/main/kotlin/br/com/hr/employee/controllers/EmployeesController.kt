package br.com.hr.employee.controllers

import br.com.hr.employee.entities.Employee
import br.com.hr.employee.services.EmployeeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeesController(private val service: EmployeeService) {
    @GetMapping("")
    fun list(): ResponseEntity<Collection<Employee>> = ResponseEntity.ok(service.findAll())

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): ResponseEntity<Employee> = ResponseEntity.ok(service.findById(id))

    @PostMapping("")
    fun  save(@RequestBody employee: Employee): ResponseEntity<Employee> = ResponseEntity.ok(service.save(employee))

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        service.delete(id)
        return  ResponseEntity.noContent().build()
    }
}