package com.rays.oop.polymorphism;

public class HomeLoan {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3];

		banks[0] = new AXISBank();
		banks[1] = new ICICIBank();
		banks[2] = new HDFCBank();

		loanEnquiry(banks);

	}

	public static void loanEnquiry(Bank[] banks) {

		for (int i = 0; i < banks.length; i++) {
			System.out.println("bank = " + banks[i].getName());
			System.out.println("interest rate = " + banks[i].interestRate());
		}

	}

}
