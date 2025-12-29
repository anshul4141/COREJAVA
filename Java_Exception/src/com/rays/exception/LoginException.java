package com.rays.exception;

public class LoginException extends RuntimeException { // custom exception class
	
	public LoginException() {
		super("user not found");
	}

}
