package com.rays.java8;

// Anonymous function is use to create Interface and FunctionalInterface instance.
public class TestAnonymousFunction {

	public static void main(String[] args) {

		HelloFunctionalInterface f = new HelloFunctionalInterface() {

			@Override
			public void say() {
				System.out.println("hello anonymous function");
			}
		};

		f.say();
	}

}
