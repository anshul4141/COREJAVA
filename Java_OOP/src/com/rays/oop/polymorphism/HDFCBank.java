package com.rays.oop.polymorphism;

public class HDFCBank extends Bank {

	@Override
	public String getName() {
		return "HDFCBank";
	}

	@Override
	public double interestRate() {
		return 10.10;
	}

}
