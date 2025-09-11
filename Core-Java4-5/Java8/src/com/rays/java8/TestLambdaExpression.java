package com.rays.java8;

public class TestLambdaExpression {

	public static void main(String[] args) {

		HelloFunctionalInt f = (i, j) -> {
			return i + j;
		};
		
		int i = 10;
		int j = 5;
		
		System.out.println(f.sum(i, j));

	}

}
