package com.rays.oop.polymorphism;

public class ICICIBank extends Bank {

	@Override
	public String getName() {
		return "ICICIBank";
	}

	@Override
	public double interestRate() {
		return 9.75;
	}

}
