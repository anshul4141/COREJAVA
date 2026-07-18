package com.rays.oop.constructor;

public class Account {

	private String accNo;
	private String accType;
	private double balance;
	
	public Account() {
		
	}

	public Account(String accNo, String accType, double balance) {
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public double getBalance() {
		return balance;
	}

}
