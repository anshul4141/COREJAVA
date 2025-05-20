package com.rays.exception;

public class TestParentCatch {

	public static void main(String[] args) {

		String name = "Vedik";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(6));
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}

	}

}
