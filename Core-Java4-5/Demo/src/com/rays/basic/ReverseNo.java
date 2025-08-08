package com.rays.basic;

public class ReverseNo {

	public static void main(String[] args) {

		int no = 123;
		int r = 0;
		int sum = 0;

		while (no > 0) {
			r = no % 10;
			sum = (sum * 10) + r;
			no = no / 10;
		}

		System.out.println("reverse no is: " + sum);

	}

}
