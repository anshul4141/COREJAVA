package com.rays.basic;

public class ReverseString {

	public static void main(String[] args) {

		String str = "google";

		System.out.println("before reverse: " + str);

		int l = str.length();

		System.out.println("lenght of str = " + l);

		System.out.println("after reverse: " + str);

		for (int i = 5; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}

	}

}
