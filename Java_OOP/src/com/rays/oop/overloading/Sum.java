package com.rays.oop.overloading;

// same name method with different parameter or data type
public class Sum {

	public int sum(int i, int j) {
		return i + j;
	}

	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	public double sum(double i, double j) {
		return i + j;
	}

	public static void main(String[] args) {

		Sum s = new Sum();

		System.out.println(s.sum(5, 10));
		System.out.println(s.sum(5, 10, 15));
		System.out.println(s.sum(4.2, 4.2));

	}
}
