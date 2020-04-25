package com.beable.pocker.security.controller;

import com.beable.pocker.security.dto.SignInRequest;
import com.beable.pocker.security.dto.SignInResponse;
import com.beable.pocker.security.error.SecException;
import com.beable.pocker.security.error.SecExceptionType;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class SignController {
	
	@NonNull
	@PostMapping(path = "/sign-in")
	public SignInResponse signIn(@RequestBody SignInRequest request) {
		
		return new SignInResponse();
	}
	
	@NonNull
	@PostMapping(path = "/sign-out")
	public String signOut(String id, String pwd) {
		
		throw new SecException(SecExceptionType.SIGN_FAILED);
	}
	
	@NonNull
	@PostMapping(path = "/sign-up")
	public String signUp(String id, String pwd) {
		
		throw new SecException(SecExceptionType.SIGN_FAILED);
	}
	
	
}
