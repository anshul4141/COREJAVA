package com.rays.io;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int input
		int intValue;
		System.out.println("Please Enter any Integer Number....");
		intValue = sc.nextInt();
		System.out.println("Entered Integer = " + intValue);

		// float input
		float floatValue;
		System.out.println("Please Enter any Float Number....");
		floatValue = sc.nextFloat();
		System.out.println("Entered Float = " + floatValue);

		// double input
		double doubleValue;
		System.out.println("Please Enter any Double Number....");
		doubleValue = sc.nextDouble();
		System.out.println("Entered Double = " + doubleValue);

		sc.nextLine(); // buffer clear (very important)

		// string input (full line)
		String lineValue;
		System.out.println("Please Enter any String (full line)....");
		lineValue = sc.nextLine();
		System.out.println("Entered Line = " + lineValue);

		// string input (single word)
		String wordValue;
		System.out.println("Please Enter any Single Word....");
		wordValue = sc.next();
		System.out.println("Entered Word = " + wordValue);

		sc.close();
	}
}
