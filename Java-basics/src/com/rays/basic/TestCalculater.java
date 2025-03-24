package com.rays.basic;

import java.util.Scanner;

public class TestCalculater {

	public static void main(String[] args) {

		int firstNo = 0;
		int secondNo = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your First No");
		firstNo = sc.nextInt();
		System.out.println("Enter Your Second No");
		secondNo = sc.nextInt();

		System.out.println("first No is = " + firstNo + " and second No is = " + secondNo);

		System.out.println("select you opration + or - or * or /");
		String opration = "";
		opration = sc.next();

		switch (opration) {
		case "+":
			System.out.println("result = " + (firstNo + secondNo));
			break;
		case "-":
			System.out.println("result = " + (firstNo - secondNo));
			break;
		case "*":
			System.out.println("result = " + (firstNo * secondNo));
			break;
		case "/":
			System.out.println("result = " + (firstNo / secondNo));
			break;
		}

	}

}
