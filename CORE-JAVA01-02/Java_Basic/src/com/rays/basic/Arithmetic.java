package com.rays.basic;

public class Arithmetic {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public void substraction(int a, int b) {
		System.out.println(a - b);
	}

	public int getMaxNo(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public String getOddOrEven(int a) {
		if (a % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

}
