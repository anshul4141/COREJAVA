package com.rays.basic;

public class TestArithmetic {

	public static void main(String[] args) {
		
		Arithmetic a = new Arithmetic();
		
		a.sum(5, 5);
		a.substraction(10, 5);
		
		System.out.println(a.getMaxNo(5, 15));
		System.out.println(a.getFullName("Ram", "Gupta"));
		
		System.out.println(a.getOddOrEven(8));

	}

}
