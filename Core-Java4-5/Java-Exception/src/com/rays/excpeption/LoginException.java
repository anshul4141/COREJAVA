package com.rays.excpeption;

public class LoginException extends Exception { // custom exception class programmer define

	public LoginException() {
		System.out.println("user not found");
	}

}
