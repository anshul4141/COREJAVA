package com.rays.basic;

public class LargestNo {

	public void largestNo(int[] num) {

		int largest = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];

			}

		}
		System.out.println("largest no in array: " + largest);

	}

	public static void main(String[] args) {

		LargestNo n = new LargestNo();

		int[] num = { 56, 89, 41, 32, 52, 879, 41 };

		n.largestNo(num);

	}

}
