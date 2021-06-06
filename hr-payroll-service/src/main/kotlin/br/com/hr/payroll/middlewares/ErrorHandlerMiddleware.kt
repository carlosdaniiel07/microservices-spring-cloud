package br.com.hr.payroll.middlewares

import br.com.hr.payroll.exceptions.ServiceUnavailableException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorHandlerMiddleware {
    @ExceptionHandler(ServiceUnavailableException::class)
    fun serviceUnavailableExceptionHandler(ex: ServiceUnavailableException): ResponseEntity<Void> {
        return ResponseEntity.status(503).body(null)
    }
}