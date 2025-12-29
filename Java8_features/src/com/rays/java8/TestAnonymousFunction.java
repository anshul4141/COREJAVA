package com.rays.java8;

public class TestAnonymousFunction {

	public static void main(String[] args) {

		HelloFunctionalInterface fi = new HelloFunctionalInterface() {

			@Override
			public void say() {
				System.out.println("hello functional interface");
			}
		};

		fi.say();

	}

}
