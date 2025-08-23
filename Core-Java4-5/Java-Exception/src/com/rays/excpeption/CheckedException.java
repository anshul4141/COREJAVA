package com.rays.excpeption;

public class CheckedException {

	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		System.out.println("in dad");
		try {
			mom();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void mom() throws Exception {

		son();

	}

	private static void son() throws Exception {

		throw new Exception("make a mistake"); // checked excpetion

	}
	
}
