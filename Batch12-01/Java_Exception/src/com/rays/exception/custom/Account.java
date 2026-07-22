package com.rays.exception.custom;

public class Account {

	private double balance;

	public Account() {

	}

	public Account(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new InsufficentFundException();
		} else {
			balance = balance - amount;
			System.out.println("new balance: " + balance);
		}
	}

}
