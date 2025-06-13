package com.rays.java8;

@FunctionalInterface
public interface HelloFunctionalInt {

	public int sum(int a, int b);

	public default void m1() {
		System.out.println("hello i am default method");
	}

	public static void m2() {
		System.out.println("hello i am static method");
	}

}
