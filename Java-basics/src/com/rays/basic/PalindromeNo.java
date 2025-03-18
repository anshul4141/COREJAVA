package com.rays.basic;

public class PalindromeNo {

	public static void main(String[] args) {

		int i = 121; // i = 121
		int temp = i; // temp = 121;
		int r = 0;
		int rnum = 0;

		while (temp > 0) {

			r = temp % 10;
			rnum = rnum * 10 + r;
			temp = temp / 10;

		}

		if (i == rnum) {

			System.out.println(i + " is palindrome");

		} else {

			System.out.println(i + " is not palindrome");

		}

	}

}
