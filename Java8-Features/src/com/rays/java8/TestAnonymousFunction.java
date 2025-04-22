package com.rays.java8;

public class TestAnonymousFunction {
	
	public static void main(String[] args) {
		
		TestFunctionalInterface f = new TestFunctionalInterface() {
			
			@Override
			public void sum(int a, int b) {
				System.out.println("sum = " + (a + b));
				
			}
		};
		
		int a = 5;
		int b = 10;
		f.sum(a, b);
		f.m1();
		TestFunctionalInterface.m2();
		
		
	}

}
