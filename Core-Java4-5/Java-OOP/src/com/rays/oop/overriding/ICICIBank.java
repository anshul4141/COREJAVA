package com.rays.oop.overriding;

public class ICICIBank extends Bank {

	@Override
	public String getName() {
		return "ICICIBank";
	}

	@Override
	public double interestRate() {
		return 9.7;
	}

}
