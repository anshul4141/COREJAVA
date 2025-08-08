package com.rays.basic;

public class FirstLargest {

	public static void main(String[] args) {

		int[] a = { 5, 15, 23, 45, 98, 23, 71 };

		int largest = a[0];

		for (int b : a) {
			if (b > largest) {
				largest = b;
			}
		}

		System.out.println(largest);

		int secLargest = a[0];

		for (int b : a) {
			if (b < largest && b > secLargest) {
				secLargest = b;
			}
		}

		System.out.println(secLargest);

	}

}
