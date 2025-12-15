package com.rays.oop.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	// getNumber return only String
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	// getAccountType return only String
	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	// getBalance return only double
	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("new balance after deposit: " + this.balance);
	}

	public void withdrawal(double amount) {

		if (amount > this.balance) {
			System.out.println("insufficent fund transfer");
		} else {
			this.balance = this.balance - amount;
			System.out.println("new balance after withdrawal: " + this.balance);
		}

	}

	public void fundTransfer(Account target, double amount) {

		if (amount > this.balance) {
			System.out.println("Insufficient balance! Transfer failed.");
		} else {
			this.balance = this.balance - amount;

			target.balance = target.balance + amount;

			System.out.println("Transfer successful!");
			System.out.println("Your new balance: " + this.balance);
			System.out.println("Receiver new balance: " + target.balance);
		}
	}

}
