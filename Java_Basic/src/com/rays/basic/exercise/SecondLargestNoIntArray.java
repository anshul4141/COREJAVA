package com.rays.basic.exercise;

public class SecondLargestNoIntArray {

	// anshul
	public static void main(String[] args) {

		int[] intArray = { 5, 10, 150, 6, 20, 14 };

		int largestNo = intArray[0];

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > largestNo) {
				largestNo = intArray[i];
			}
		}
		System.out.println("first largest no: " + largestNo);

		int secondLargestNo = intArray[0];

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < largestNo && intArray[i] > secondLargestNo) {
				secondLargestNo = intArray[i];
			}
		}
		System.out.println("seconed largest no: " + secondLargestNo);

	}

}
