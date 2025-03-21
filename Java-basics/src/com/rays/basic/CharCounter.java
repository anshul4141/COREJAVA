package com.rays.basic;

public class CharCounter {

	public static void main(String[] args) {

		String name = "raman";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if ('a' == name.charAt(i)) {

				count++;

			}

		}

		System.out.println("a = " + count);

	}

}
