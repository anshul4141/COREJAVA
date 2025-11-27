package com.rays.basic;

public class ArmstroingNo {

	public static void main(String[] args) {

		int temp = 154;
		int i = 154;
		int r = 0;
		int armsNo = 0;

		while (i > 0) {
			r = i % 10;
			armsNo = armsNo + r * r * r;
			i = i / 10;
		}

		System.out.println("armsNo: " + armsNo);
		if (temp == armsNo) {
			System.out.println("armsNo");
		} else {
			System.out.println("not armsNo");
		}

	}

}
