package com.beable.pocker.security.spring;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * 반환을 위한 유틸 클래스
 */
public final class Response {
	
	/**
	 * private 생성자
	 */
	private Response() {
		
		super();
	}
	
	/**
	 * Json 형태로 모델을 반환합니다
	 *
	 * @param model 모델
	 * @param <T>   모델 타입
	 * @return ResponseEntity
	 */
	public static <T> ResponseEntity<T> okJson(T model) {
		
		return statusJson(HttpStatus.OK, model);
	}
	
	/**
	 * Json 형태로 모델을 반환합니다
	 *
	 * @param status 상태
	 * @param model  모델
	 * @param <T>    모델 타입
	 * @return ResponseEntity
	 */
	public static <T> ResponseEntity<T> statusJson(HttpStatus status, T model) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		ArrayList<Charset> acceptableCharsets = new ArrayList<>();
		acceptableCharsets.add(StandardCharsets.UTF_8);
		headers.setAcceptCharset(acceptableCharsets);
		
		return ResponseEntity.status(status)
				.headers(headers)
				.body(model);
	}
}
