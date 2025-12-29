package com.rays.basic.exercise;

public class FindPositionOfAIntInArray {

	// anshul
	public static void main(String[] args) {

		int[] arr = { 18, 17, 16, 14, 14, 5, 6, 7, 8 };
		int num = 14;

		int temp = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				temp = i;
				System.out.println(num + " = " + temp);
			}
		}

		System.out.println(temp == -1 ? temp : "");
	}

}
