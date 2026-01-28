package com.rays.oop.polymorphism;

public class Bank {

	public String getName() {
		return "RBIBank";
	}

	public double interestRate() {
		return 11.0;
	}

	public static Bank getBank(int i) {

		if (i == 1)
			return new HDFCBank();
		if (i == 2)
			return new ICICIBank();
		if (i == 3)
			return new AxisBank();
		return new Bank();

	}

}
