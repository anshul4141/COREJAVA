package com.rays.java8;

public class TestSumFunctinalInt {

	public static void main(String[] args) {

		SumFunctinalInt s = (i, b) -> {
			return i + b;
		};
		
		System.out.println(s.sum(5, 5));

	}

}
