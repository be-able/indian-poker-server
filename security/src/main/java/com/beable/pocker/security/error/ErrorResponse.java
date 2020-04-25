package com.beable.pocker.security.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * 에러 리스폰스
 */
@Builder
@AllArgsConstructor
public class ErrorResponse {
	
	/**
	 * 메시지
	 */
	@Getter
	private final String message;
	
	/**
	 * 에러타입
	 */
	@Getter
	private final String errorType;
	
}
