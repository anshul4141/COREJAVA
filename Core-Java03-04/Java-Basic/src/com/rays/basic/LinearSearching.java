package com.rays.basic;

public class LinearSearching {

	public void linearSearching(int[] a, int b) {

		int temp = -1;

		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				temp = i;
				System.out.println("position of " + b + " is: " + temp);
			}
		}

		if (temp == -1) {
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {

		LinearSearching l = new LinearSearching(); 
		int[] a = { 5, 5, 2, 7, 8, 8, 9 };
		int b = 2;
		l.linearSearching(a, b);

	}

}
