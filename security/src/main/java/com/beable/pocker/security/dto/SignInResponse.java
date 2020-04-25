package com.beable.pocker.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 토큰 반환
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInResponse {
	
	/**
	 * 토큰
	 */
	private String token;
	
	/**
	 * 유저
	 */
	private UserDto user;
}
