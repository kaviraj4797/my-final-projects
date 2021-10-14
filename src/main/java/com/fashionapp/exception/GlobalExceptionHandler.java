package com.fashionapp.exception;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.fashionapp.model.ApiErrors;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity<Object> handleProductNotFound(RuntimeException ex) {
		String message = ex.getMessage();
		LocalDateTime timestamp = LocalDateTime.now();
		String error = "sorry bro...item not available";

		ApiErrors errors = new ApiErrors(timestamp, message, HttpStatus.CONFLICT.value(), error);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errors);

	}
}