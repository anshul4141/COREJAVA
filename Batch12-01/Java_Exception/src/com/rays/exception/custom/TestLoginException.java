package com.rays.exception.custom;

public class TestLoginException {
	
	public static void main(String[] args) throws LoginException {
		
		String login = "admin123";
		
		if(login.equals("admin")) {
			System.out.println("user found");
		} else {
			throw new LoginException();
		}
		
	}

}
