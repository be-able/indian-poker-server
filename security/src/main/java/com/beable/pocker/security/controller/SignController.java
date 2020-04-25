package com.beable.pocker.security.controller;

import com.beable.pocker.security.dto.SignInRequest;
import com.beable.pocker.security.dto.SignInResponse;
import com.beable.pocker.security.spring.Response;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class SignController {
	
	@NonNull
	@PostMapping(path = "/sign-in")
	public ResponseEntity<SignInResponse> signIn(@RequestBody SignInRequest request) {
		
		return Response.okJson(new SignInResponse());
	}
	
	@NonNull
	@PostMapping(path = "/sign-out")
	public ResponseEntity<String> signOut(String id, String pwd) {
		
		return Response.okJson("succeed");
	}
	
	@NonNull
	@PostMapping(path = "/sign-up")
	public ResponseEntity<String> signUp(String id, String pwd) {
		
		return Response.okJson("succeed");
	}
	
}
