package com.rays.basic;

public class OddEven {

	public void isOddOrEven(int[] i) {

		for (int a : i) {
			if (a % 2 == 0) {
				System.out.println(a + " is even no");
			} else {
				System.out.println(a + " is odd no");
			}
		}

	}

	public static void main(String[] args) {
		
		OddEven o = new OddEven();
		int[] i = {5, 2, 6, 7, 9, 8, 4};
		o.isOddOrEven(i);
		
//		int a = 8;
//		if (a % 2 == 0) {
//			System.out.println("even no: " + a);
//		} else {
//			System.out.println("odd no: " + a);
//		}
	}
}
