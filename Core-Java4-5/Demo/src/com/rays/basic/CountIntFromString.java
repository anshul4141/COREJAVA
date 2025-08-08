package com.rays.basic;

public class CountIntFromString {

	public static void main(String[] args) {

		String str = "Ra12m";
		int count = 0;

		//System.out.println("lenght: " + str.length());

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				count++;
			}

		}

		System.out.println("no of int is: " + count);

	}

}
