package com.rays.basic;

public class FindLargestNoFromArray {

	public static void main(String[] args) {

		int[] a = { 5, 10, 15, 20, 25, 15 };

		int largestNo = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largestNo) {
				largestNo = a[i];
			}

		}
		System.out.println("largestNo is: " + largestNo);

		int secondLargestNo = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] < largestNo && a[i] > secondLargestNo) {
				secondLargestNo = a[i];
			}

		}

		System.out.println("secondLargest is: " + secondLargestNo);

	}

}
