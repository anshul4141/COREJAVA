package com.rays.oop.polymorphism;

public class HDFCBank extends Bank {

	@Override
	public double interestRate() {
		return 10.10;
	}

	@Override
	public String getName() {
		return "HDFCBank";
	}

}
