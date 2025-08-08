package com.rays.basic;

public class ArmstrongNo {

	public static void main(String[] args) {

		int no = 152;
		int temp = no;
		int r = 0;
		int sum = 0;

		while (temp > 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}

		System.out.println(sum);

		if (no == sum) {
			System.out.println("armstrong no");
		} else {
			System.out.println("not armstrong no");
		}

	}

}
