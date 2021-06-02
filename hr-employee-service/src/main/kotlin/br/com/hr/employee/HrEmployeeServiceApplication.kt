package br.com.hr.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HrEmployeeServiceApplication

fun main(args: Array<String>) {
	runApplication<HrEmployeeServiceApplication>(*args)
}
