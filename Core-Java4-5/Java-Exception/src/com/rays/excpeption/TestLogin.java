package com.rays.excpeption;

public class TestLogin {

	public static void main(String[] args) throws LoginException {

		String login = "admin";

		if (login != null && login == "admin123") {
			System.out.println("user found");
		} else {
			//System.out.println("user not found");
			throw new LoginException();
		}

		System.out.println("login successfully..");

	}

}
