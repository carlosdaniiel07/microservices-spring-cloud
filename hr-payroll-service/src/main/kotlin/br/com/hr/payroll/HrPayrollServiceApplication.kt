package br.com.hr.payroll

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@RibbonClient(name = "hr-employee-service")
@SpringBootApplication
class HrPayrollServiceApplication

fun main(args: Array<String>) {
	runApplication<HrPayrollServiceApplication>(*args)
}
