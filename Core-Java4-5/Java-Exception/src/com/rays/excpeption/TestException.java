package com.rays.excpeption;

public class TestException {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.charAt(3));
			System.out.println(name.length());
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		} 
	}

}
