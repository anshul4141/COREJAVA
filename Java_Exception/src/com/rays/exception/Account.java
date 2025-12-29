package com.rays.exception;

public class Account {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > this.balance) {
			throw new InsufficentFundException();
		} else {
			this.balance = this.balance - amount;
			System.out.println("new balance: " + this.balance);
		}
	}

}
