package com.rays.basic;

public class MaximumNo {

	public static void main(String[] args) {

		int a = 5;
		int b = 15;

		if (a > b) { // 5 > 15
			System.out.println("max: " + a);
		} else if (a == b) { // 5 == 15
			System.out.println(a + " is equal " + b);
		} else {
			System.out.println("max: " + b);
		}

	}

}
