package br.com.hr.payroll

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HrPayrollServiceApplication

fun main(args: Array<String>) {
	runApplication<HrPayrollServiceApplication>(*args)
}
