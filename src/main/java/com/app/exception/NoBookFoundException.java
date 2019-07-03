package com.app.exception;

/**
 * 
 * Creating User Defined Exception with custom message
 * 
 * 
 *
 */




public class NoBookFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoBookFoundException(String msg) {
		super(msg);
	}
	
	
}
