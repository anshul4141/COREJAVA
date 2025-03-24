package com.rays.basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you no");
		a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}

	}

}
