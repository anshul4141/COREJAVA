package com.rays.basic;

public class TestMethods {

	public static void main(String[] args) {

		Methods m = new Methods();

		System.out.println(m.sum(5, 5));
		int i = m.sum(6, 6);
		System.out.println(i);
		m.multiply(2, 2);
		m.substraction(4, 2);
		// System.out.println(m.greeting());
		String s = m.greeting("Vedik", 123);
		System.out.println(s);

	}

}
