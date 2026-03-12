package com.rays.java8;

// Lambda expression is used to create only FunctionalInterface instance.
public class TestLambdaExpression {

	public static void main(String[] args) {

		HelloFunctionalInterface fi = () -> {
			System.out.println("hello lambda expression");
		};

		fi.say();

	}

}
