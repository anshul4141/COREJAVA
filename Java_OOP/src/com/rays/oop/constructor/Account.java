package com.rays.oop.constructor;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public Account(String number, String accountType, double balance) {
		this.number = number;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public String getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

}
