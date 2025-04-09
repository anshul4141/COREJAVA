package com.rays.exception;

public class TestArithmetic {

	public static void main(String[] args) {

		int a = 0;
		int b = 5;

		try {
			int c = b / a;
			System.out.println("c = " + c);
		} catch (NullPointerException e) {
			System.out.println("exception = " + e.getMessage());
		} finally {
			System.out.println("always execute");
		}

		System.out.println("programe is complited");

	}

}
