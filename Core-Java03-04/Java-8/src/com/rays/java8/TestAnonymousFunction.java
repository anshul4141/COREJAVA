package com.rays.java8;

public class TestAnonymousFunction {

	public static void main(String[] args) {

		HelloFunctionalInt f = new HelloFunctionalInt() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		int a = 5;
		int b = 10;

		System.out.println(f.sum(a, b));
		f.m1();
		HelloFunctionalInt.m2();

	}

}
