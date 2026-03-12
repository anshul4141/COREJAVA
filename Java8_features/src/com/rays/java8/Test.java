package com.rays.java8;

public class Test {

	public static void getInts(int... i) {
		for (int a : i) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		getInts(1, 2, 3, 4, 5);
	}

}
