package com.rays.java8;

public class TestLembdaExpression {

	public static void main(String[] args) {

		HelloFunctionalInt f = (a, b) -> {
			return a + b;
		};
		
		int a = 5;
		int b = 10;
		
		System.out.println(f.sum(a, b));

	}

}
