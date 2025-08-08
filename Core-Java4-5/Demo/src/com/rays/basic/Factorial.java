package com.rays.basic;

public class Factorial {
	public static void main(String[] args) {

		int fact = 1;

		for (int i = 9; i > 0; i--) {

			fact = fact * i;

		}

		System.out.println(fact);
	}
}
