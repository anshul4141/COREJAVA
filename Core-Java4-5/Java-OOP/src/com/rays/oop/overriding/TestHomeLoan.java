package com.rays.oop.overriding;

public class TestHomeLoan {

	public static void main(String[] args) {

		Bank b1 = new AxisBank();
		System.out.println("bank name: " + b1.getName() + " interest rate: " + b1.interestRate());

		Bank b2 = new HDFCBank();
		System.out.println("bank name: " + b2.getName() + " interest rate: " + b2.interestRate());

		Bank b3 = new ICICIBank();
		System.out.println("bank name: " + b3.getName() + " interest rate: " + b3.interestRate());

	}

}
