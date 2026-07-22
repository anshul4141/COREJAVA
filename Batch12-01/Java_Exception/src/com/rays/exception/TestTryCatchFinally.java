package com.rays.exception;

public class TestTryCatchFinally {

	public static void main(String[] args) {

		int a = 0;
		int b = 10;

		try {
			int div = b / a;
			System.out.println(div);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("this is finally block");
		}

	}

}
