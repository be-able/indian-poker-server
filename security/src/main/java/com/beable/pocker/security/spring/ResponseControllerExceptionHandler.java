package com.beable.pocker.security.spring;

import com.beable.pocker.security.error.ErrorResponse;
import com.beable.pocker.security.error.LogicalException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 컨트롤러에서 핸들링 되지 못한 예외를 핸들링 하기 위한 클래스
 */
@ControllerAdvice
public class ResponseControllerExceptionHandler {
	
	/**
	 * 에외로부터 원인 예외의 클래스 이름을 반환한다
	 *
	 * @param e 예외
	 * @return 예외 이름
	 */
	private String getSimpleCauseName(@Nullable Exception e) {
		
		if (e == null) {
			return StringUtils.EMPTY;
		}
		
		String simpleName;
		Throwable cause = e.getCause();
		if (cause == null) {
			simpleName = e.getClass().getSimpleName();
		} else {
			simpleName = cause.getClass().getSimpleName();
		}
		return simpleName;
	}
	
	/**
	 * 논리 에러가 그대로 흘러 나가려 할 때 동작할 함수
	 *
	 * @param request 요청
	 * @param e       에러
	 * @return 반환
	 */
	@ExceptionHandler(value = LogicalException.class)
	protected ResponseEntity<ErrorResponse> handleLogicalException(
			HttpServletRequest request,
			LogicalException e) {
		
		String simpleName = getSimpleCauseName(e);
		
		ErrorResponse errorResponse = ErrorResponse.builder()
				.message(e.getMessage())
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.error(simpleName)
				.path(request.getRequestURI())
				.build();
		
		return Response.okJson(errorResponse);
	}
	
	/**
	 * 널 예외가 반환 할 때 동작할 함수
	 *
	 * @param request 요청
	 * @param e       예외
	 * @return 예외 반환
	 */
	@ExceptionHandler(value = NullPointerException.class)
	protected ResponseEntity<ErrorResponse> nullException(
			HttpServletRequest request,
			NullPointerException e) {
		
		String simpleName = getSimpleCauseName(e);
		
		ErrorResponse errorResponse = ErrorResponse.builder()
				.message(e.getMessage())
				.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.error(simpleName)
				.path(request.getRequestURI())
				.build();
		
		return Response.statusJson(HttpStatus.INTERNAL_SERVER_ERROR, errorResponse);
	}
}