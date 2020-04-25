package com.beable.pocker.security.spring;

import com.beable.pocker.security.error.ErrorResponse;
import com.beable.pocker.security.error.SecException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 컨트롤러에서 핸들링 되지 못한 예외를 핸들링 하기 위한 클래스
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	protected ResponseEntity<ErrorResponse> nullException(SecException e) {
		
		ErrorResponse errorResponse = ErrorResponse.builder()
				.message(e.getType().getMessage())
				.errorType(e.getType().name())
				.build();
		
		return new ResponseEntity<>(errorResponse, e.getType().getStatus());
	}
	
	@ExceptionHandler(value = SecException.class)
	protected ResponseEntity<ErrorResponse> secException(SecException e) {
		
		ErrorResponse errorResponse = ErrorResponse.builder()
				.message(e.getType().getMessage())
				.errorType(e.getType().name())
				.build();
		
		return new ResponseEntity<>(errorResponse, e.getType().getStatus());
	}
	
}