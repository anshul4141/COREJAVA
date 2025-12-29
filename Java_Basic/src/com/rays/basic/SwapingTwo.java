package com.rays.basic;

public class SwapingTwo {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("-----------");
		// swaping

	    a = a + b; // a = 15;
		b = a - b; // b = 5;
		a = a - b; // a = 10;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
