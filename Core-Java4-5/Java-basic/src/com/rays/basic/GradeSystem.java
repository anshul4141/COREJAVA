package com.rays.basic;

public class GradeSystem {

	public static void main(String[] args) {

		int marks = 70;

		if (marks >= 90) {
			System.out.println("Grade: A");
		} else if (marks >= 70) {
			System.out.println("Grade: B");
		} else if (marks >= 60) {
			System.out.println("Grade: C");
		} else if (marks >= 50) {
			System.out.println("Grade: D");
		} else if (marks == 33 || marks < 50) {
			System.out.println("pass in third division");
		} else {
			System.out.println("Your are fail");
		}

	}

}
