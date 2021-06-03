package br.com.hr.employee.services

import br.com.hr.employee.entities.Employee
import br.com.hr.employee.exceptions.ObjectNotFoundException
import br.com.hr.employee.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val repository: EmployeeRepository) {

    fun findAll(): Collection<Employee> = repository.findAll()

    fun findById(id: Long): Employee {
        val employee = repository.findById(id)

        if (employee.isEmpty) {
            throw ObjectNotFoundException("Employee not found (id $id)")
        }

        return  employee.get()
    }

    fun save(employee: Employee): Employee = repository.save(employee)

    fun delete(id: Long) {
        val employee = findById(id)
        repository.delete(employee)
    }
}