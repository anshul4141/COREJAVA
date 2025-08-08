package com.rays.basic;

public class PrimeNo {

	public static void main(String[] args) {

		int n = 6;
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}

	}

}
