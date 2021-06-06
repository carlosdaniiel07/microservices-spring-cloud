package br.com.hr.employee.controllers

import br.com.hr.employee.entities.Employee
import br.com.hr.employee.services.EmployeeService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.env.Environment
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employees")
class EmployeesController(private val service: EmployeeService, private val env: Environment) {
    private val logger: Logger = LoggerFactory.getLogger(EmployeesController::class.java)

    @GetMapping("")
    fun list(): ResponseEntity<Collection<Employee>> = ResponseEntity.ok(service.findAll())

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): ResponseEntity<Employee> {
        logger.info("Aplicação rodando na porta: ${env.getProperty("local.server.port")}")
        return ResponseEntity.ok(service.findById(id))
    }

    @PostMapping("")
    fun  save(@RequestBody employee: Employee): ResponseEntity<Employee> = ResponseEntity.ok(service.save(employee))

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Employee> {
        service.delete(id)
        return  ResponseEntity.noContent().build()
    }
}