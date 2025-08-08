package com.rays.basic;

public class Swaping {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c = 0;

		System.out.println("before swaping");
		System.out.println("a = " + a + " " + " b = " + b);

		c = a; // c = 5;
		a = b; // a = 10;
		b = c; // b = 5;

		System.out.println("after swaping");
		System.out.println("a = " + a + " " + " b = " + b);

	}

}
