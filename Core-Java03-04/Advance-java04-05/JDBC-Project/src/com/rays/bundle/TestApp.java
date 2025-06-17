package com.rays.bundle;

import java.util.ResourceBundle;

public class TestApp {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");
		
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		String driver = rb.getString("driver");
		
		System.out.println(url + "\n" + username + "\n" + password + "\n" + driver);
		
	}

}
