package br.com.hr.payroll.model

data class Payment(val name: String, val dailyIncome: Double, val days: Int, val total: Double = dailyIncome * days) {

}