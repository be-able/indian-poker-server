package com.beable.pocker.security.error;

/**
 * 서비스에서 발생하면 반환할 예외
 */
public class LogicalException extends Exception {
	
	/**
	 * 생성자
	 */
	public LogicalException() {
		
		super();
	}
	
	/**
	 * 생성자
	 */
	public LogicalException(String message) {
		
		super(message);
	}
	
	/**
	 * 생성자
	 */
	public LogicalException(String message, Throwable cause) {
		
		super(message, cause);
	}
	
	/**
	 * 생성자
	 */
	public LogicalException(Throwable cause) {
		
		super(cause);
	}
	
	/**
	 * 생성자
	 */
	public LogicalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
