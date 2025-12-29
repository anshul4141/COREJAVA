package com.rays.basic.exercise;

public class ReversDigit {

	// anshul
	public static void main(String[] args) {

		int num = 132;
		int num2 = num;
		int r = 0;
		int sum = 0;

		while (num2 != 0) {
			r = num2 % 10;
			sum = (sum * 10) + r;
			num2 = num2 / 10;
		}

		System.out.println("reverse no. " + sum);

	}

}
