package com.rays.basic;

public class PalindromeNo {

	public static void main(String[] args) {

		int temp = 123;
		int i = 123;
		int r = 0;
		int reversNo = 0;

		while (i > 0) {
			r = i % 10;
			reversNo = (reversNo * 10) + r;
			i = i / 10;
		}

		System.out.println("reversNo: " + reversNo);
		if(temp == reversNo) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
