package com.rays.basic;

public class Test {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		System.out.println("before swaping");
		System.out.println("a = " + a + " " + " b = " + b);

		a = a + b; // a = 15
		b = a - b; // b = 5
		a = a - b; // a = 10

		System.out.println("after swaping");
		System.out.println("a = " + a + " " + " b = " + b);

	}

}
