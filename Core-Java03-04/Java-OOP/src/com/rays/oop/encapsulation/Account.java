package com.rays.oop.encapsulation;

public class Account {

	private String accountNo;
	private String accountType;
	private double balance;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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

	public void deposite(double amt) {

		this.balance = this.balance + amt;
		System.out.println("total balance after deposite: " + this.balance);

	}

	public void withdrawal(double amt) {

		if (amt > this.balance) {
			System.out.println("inssuficent fund...");
		} else {
			this.balance = this.balance - amt;
			System.out.println("total balance after withdrawal: " + this.balance);
		}

	}

}
