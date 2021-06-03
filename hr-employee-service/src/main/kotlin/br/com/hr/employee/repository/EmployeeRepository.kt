package br.com.hr.employee.repository

import br.com.hr.employee.entities.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository : JpaRepository<Employee, Long> {

}