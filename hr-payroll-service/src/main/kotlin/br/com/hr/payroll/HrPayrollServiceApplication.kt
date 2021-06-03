package br.com.hr.payroll

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class HrPayrollServiceApplication

fun main(args: Array<String>) {
	runApplication<HrPayrollServiceApplication>(*args)
}
