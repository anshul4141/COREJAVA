package com.rays.exception;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {

		String login = "admin123";
		String pwd = "admin";

		if (login == "admin" && pwd == "admin") {
			System.out.println("user found successfully");
		} else {
			throw new LoginException("invalid login or pwd");
		}

	}

}
