package com.beable.pocker.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	/**
	 * 유저 아이디
	 */
	@NotNull
	private Long id;
	
	/**
	 * 유저 이메일
	 */
	@Email
	@NotNull
	private String email;
}
