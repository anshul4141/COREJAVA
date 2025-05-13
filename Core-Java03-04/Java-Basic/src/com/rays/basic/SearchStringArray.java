package com.rays.basic;

public class SearchStringArray {

	public void linearSearching(String[] a, String b) {

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

		SearchStringArray l = new SearchStringArray();
		String[] a = { "Ram", "Aman", "Ram", "Pawan", "Vedik", "Rays", "Vedik" };
		String b = "Vedik";
		l.linearSearching(a, b);

	}

}
