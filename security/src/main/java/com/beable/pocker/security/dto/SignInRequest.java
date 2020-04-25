package com.beable.pocker.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * 로그인 요청
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequest {
	
	/**
	 * 이메일
	 */
	@NotNull
	@Email
	private String email;
	
	/**
	 * 비밀번호
	 */
	@NotNull
	private String saved;
}
