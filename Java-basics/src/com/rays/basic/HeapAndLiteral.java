package com.rays.basic;

public class HeapAndLiteral {

	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = "sunrays";
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");

		System.out.println(s1 == s3); // false
		System.out.println(s4.equals(s2)); // false

	}

}
