package com.rays.exception;

public class UserLogin {

	public static void main(String[] args) throws LoginException {

		String login = "admin";
		String pwd = "admin";

		if (login == "admin" && pwd == "admin123") {

			System.out.println("login successfully");

		} else {
			throw new LoginException("login or pwd is invalid");
		}

	}

}
