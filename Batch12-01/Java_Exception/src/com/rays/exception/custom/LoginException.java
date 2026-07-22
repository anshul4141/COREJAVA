package com.rays.exception.custom;

public class LoginException extends Exception { // Custom checked exception

	public LoginException() {
		super("invalid credentials");
	}

}
