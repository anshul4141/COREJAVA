package com.rays.java8;

public class TestLembdaExpression {

	public static void main(String[] args) {

		TestFunctionalInterface f = (a, b) -> {
			System.out.println("sum = " + (a + b));
		};
		
		int a = 5;
		int b = 10;
		f.sum(a, b);
		f.m1();
		TestFunctionalInterface.m2();

	}

}
