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
}
