package com.rays.basic;

public class TestArray {

	public static void main(String[] args) {

		int[] a = { 5, 15, 23, 45, 98, 71 };

		System.out.println("---foreach loop---");
		for (int b : a) {
			System.out.println(b + " ");
		}

		System.out.println("---for loop---");

		for (int i = 0; i < a.length; i++) {
			System.out.println(i + " = " + a[i]);
		}
	}

}
