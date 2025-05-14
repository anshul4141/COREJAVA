package com.rays.java8;

@FunctionalInterface
public interface HelloFunctionalInterface {

	public void sum(int a, int b);

	public default void m1() {
		System.out.println("i am default method");
	}

	public static void m2() {
		System.out.println("i am static method");
	}
}
