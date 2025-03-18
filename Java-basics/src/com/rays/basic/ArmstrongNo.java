package com.rays.basic;

public class ArmstrongNo {

	public static void main(String[] args) {

		int i = 152;
		int temp = i;
		int r = 0;
		int sum = 0;

		while (temp > 0) {

			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;

		}

		System.out.println(sum);
		if (i == sum) {

			System.out.println(i + " is armstrong no");

		} else {

			System.out.println(i + " is not armstrong no");

		}

	}

}
