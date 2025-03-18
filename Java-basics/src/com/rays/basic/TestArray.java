package com.rays.basic;

public class TestArray {

	public static void main(String[] args) {

		int[] i = { 4, 5, 6, 7 };

		System.out.println(i[2]);

		System.out.println("---for each loop---");

		for (int a : i) {
			System.out.println(a);
		}
	}

}
