package com.rays.basic;

public class HeapAndLiteral {

	public static void main(String[] args) {

		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = new String("sunrays");
		String s4 = new String("Welcome");

		System.out.println(s1.equals(s4));
		System.out.println(s1 == s4);

	}

}
