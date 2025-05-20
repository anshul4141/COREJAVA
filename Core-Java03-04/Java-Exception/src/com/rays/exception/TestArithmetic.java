package com.rays.exception;

public class TestArithmetic {

	public static void main(String[] args) {

		int k = 0;
		int i = 10;

		try {
			int div = i / k;
			System.out.println(div);
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		} finally {
			System.out.println("always execute");
		}

		System.out.println("programe khatam huaa...");

	}

}
