package br.com.hr.employee.entities

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Column
import javax.persistence.Id

@Entity
@Table(name = "employee")
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @Column(nullable = false, length = 100)
    val name: String? = null

    @Column(name = "daily_income", nullable = false, scale = 12, precision = 2)
    val dailyIncome: Double? = null
}