package com.rays.basic;

public class FindNoInArray {

	public static void main(String[] args) {

		int[] a = { 5, 15, 23, 45, 98, 23, 71 };

		int n = 98;
		int position = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				position = i;
				System.out.println(n + " = " + position);
			}
		}

		if (position == -1) {
			System.out.println(n + " = " + position);
		}

	}

}
