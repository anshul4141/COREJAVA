package com.rays.oop.polymorphism;

public class HomeLoan {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3];

		banks[0] = new HDFCBank();
		banks[1] = new ICICIBank();
		banks[2] = new AXISBank();

		loanEnquiry(banks);

	}

	public static void loanEnquiry(Bank[] banks) {
		for (int i = 0; i < banks.length; i++) {
			System.out.println(banks[i].getName());
			System.out.println(banks[i].interestRate());
		}
	}

}
