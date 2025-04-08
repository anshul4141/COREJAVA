package com.rays.exception;

public class TestException {

	public static void main(String[] args) {

		String str = "rays";

		try {
			System.out.println(str.length());
			System.out.println(str.charAt(4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
