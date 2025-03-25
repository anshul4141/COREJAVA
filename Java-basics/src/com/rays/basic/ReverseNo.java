package com.rays.basic;

public class ReverseNo {

	public static void main(String[] args) {

		int i = 120;
		int temp = i;
		int r = 0;
		int rnum = 0;

		while (temp > 0) {

			r = temp % 10;
			rnum = rnum * 10 + r;
			temp = temp / 10;

		}

		System.out.println("reverse no of " + i + " is " + rnum);

	}

}
