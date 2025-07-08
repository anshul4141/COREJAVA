package com.rays.oop.constructor;

public class Account {

	private String accoutNumber;
	private int balance;
	
	

	public Account(String accountNumber, int balance) {
		this.accoutNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccoutNumber() {
		return accoutNumber;
	}

	public int getBalance() {
		return balance;
	}

}
