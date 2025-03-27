package com.rays.oop.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// deposit method
	public void deposit(double amt) {
		this.balance = this.balance + amt;
		System.out.println("total balance after deposit = " + this.balance);
	}

	// withdrawal method
	public void withdrawal(double amt) {

		if (amt > this.balance) {
			System.err.println("insufficent fund..");
		} else {
			this.balance = this.balance - amt;
			System.out.println("total balance after withdrawal = " + this.balance);

		}

	}

}
