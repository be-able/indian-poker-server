package com.beable.pocker.security.error;

import lombok.Getter;

/**
 * 예외
 */
public class SecException extends RuntimeException {
	
	/**
	 * 예외 종류
	 */
	@Getter
	private SecExceptionType type;
	
	/**
	 * 생성자
	 *
	 * @param type 예외 종류
	 */
	public SecException(SecExceptionType type) {
		
		this.type = type;
	}
}
