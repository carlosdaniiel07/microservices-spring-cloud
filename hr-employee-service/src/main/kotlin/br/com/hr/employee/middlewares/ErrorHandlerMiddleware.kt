package br.com.hr.employee.middlewares

import br.com.hr.employee.exceptions.ObjectNotFoundException
import br.com.hr.employee.models.ErrorResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorHandlerMiddleware {
    @ExceptionHandler(ObjectNotFoundException::class)
    fun objectNotFoundExceptionHandler(ex: ObjectNotFoundException): ResponseEntity<ErrorResponse> {
        val response = ErrorResponse(System.currentTimeMillis(), ex.message ?: "Objeto não encontrado")
        return ResponseEntity.status(404).body(response)
    }
}