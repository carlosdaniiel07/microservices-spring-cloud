package br.com.hr.employee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class HrEmployeeServiceApplication

fun main(args: Array<String>) {
	runApplication<HrEmployeeServiceApplication>(*args)
}
