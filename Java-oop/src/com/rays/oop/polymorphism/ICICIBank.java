package com.rays.oop.polymorphism;

public class ICICIBank extends Bank {

	@Override
	public double interestRate() {
		return 9.75;
	}

	@Override
	public String getName() {
		return "ICICIBank";
	}

}
