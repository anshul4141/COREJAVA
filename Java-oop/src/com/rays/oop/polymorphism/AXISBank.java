package com.rays.oop.polymorphism;

public class AXISBank extends Bank {

	@Override
	public double interestRate() {
		return 11.25;
	}

	@Override
	public String getName() {
		return "AXISBank";
	}

}
