package com.rays.basic;

public class PrimeNo {

	public void isPrime(int[] i) {
		int count = 0;

		for (int a : i) {
			for (int j = 2; j < a; j++) {
				if (a % j == 0) {
					count++;
				}
			}

			if (count != 0) {
				System.out.println(a + " is not prime");
				count = 0;
			} else {
				System.out.println(a + " is prime");
			}
		}
	}

	public static void main(String[] args) {

		PrimeNo n = new PrimeNo();
		int[] i = { 5, 7, 2, 3, 9, 4, 2 };
		n.isPrime(i);

	}

}
