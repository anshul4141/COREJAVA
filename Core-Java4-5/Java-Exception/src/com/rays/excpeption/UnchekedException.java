package com.rays.excpeption;

public class UnchekedException {

	public static void main(String[] args) {
		dad();
	}

	private static void dad() {
		System.out.println("in dad");
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void mom() {

		son();

	}

	private static void son() {

		throw new RuntimeException("make a mistake"); // unchecked excpetion

	}

}
