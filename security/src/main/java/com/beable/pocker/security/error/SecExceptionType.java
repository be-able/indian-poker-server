package com.beable.pocker.security.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum SecExceptionType {
	
	SIGN_FAILED("파라미터가 부족합니다", HttpStatus.BAD_REQUEST);
	
	/**
	 * 상태
	 */
	@Getter
	private HttpStatus status;
	
	/**
	 * 메시지
	 */
	@Getter
	private String message;
	
	/**
	 * 생성자
	 *
	 * @param message 메시지
	 * @param status  상태
	 */
	SecExceptionType(String message, HttpStatus status) {
		
		this.message = message;
		this.status = status;
	}
}
