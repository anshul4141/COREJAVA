package com.rays.oop.encapsulation;

public class Account {

	private String accNumber;
	private String accType;
	private double balance;

	public String getAccNumber() {
		return this.accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("new balance after deposite: " + this.balance);
	}

	public void withdrawal(double amount) {
		if (amount > this.balance && this.balance - amount < 1000) {
			System.out.println("insufficent fund transfer...!");
		} else {
			this.balance = this.balance - amount;
			System.out.println("new balance after withdrawal: " + this.balance);
		}
	}

}
