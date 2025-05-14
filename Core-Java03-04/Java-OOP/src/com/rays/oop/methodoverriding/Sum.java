package com.rays.oop.methodoverriding;

public class Sum {

	public void sum(int a, int b) {
		System.out.println("sum of two no = " + (a + b));
	}

	public void sum(int a, double b) {
		System.out.println("sum of two no = " + (a + b));
	}

	public void sum(int a, int b, int c) {
		System.out.println("sum of two no = " + (a + b));
	}

}
