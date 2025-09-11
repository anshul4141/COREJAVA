package com.rays.java8;

public class TestAnonymousFunction {

	public static void main(String[] args) {

		HelloFunctionalInt f = new HelloFunctionalInt() {

			@Override
			public int sum(int i, int j) {
				// TODO Auto-generated method stub
				return i + j;
			}
		};
		
		int i = 10;
		int j = 5;
		
		System.out.println(f.sum(i, j));
		f.m1();
		HelloFunctionalInt.m2();

	}

}
