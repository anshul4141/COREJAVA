package com.rays.java8;

public class TestSumFunctinalInt {

	public static void main(String[] args) {

		System.out.println("-------anonymous function------");

		SumFunctinalInt s = new SumFunctinalInt() {

			@Override
			public int sum(int i, int b) {
				int a = i + b;
				return a;
			}
		};

		System.out.println(s.sum(5, 10));

		System.out.println("-------lembda expression-------");

		SumFunctinalInt s1 = (a, b) -> {
			return a + b;
		};

		System.out.println(s1.sum(5, 10));
	}

}
