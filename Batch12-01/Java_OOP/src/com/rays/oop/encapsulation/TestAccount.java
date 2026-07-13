package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account();

		a1.setAccNumber("1232525659857");
		a1.setAccType("saving");
		a1.setBalance(5000.00);

		System.out.println("a1 account number: " + a1.getAccNumber());
		System.out.println("a1 account type: " + a1.getAccType());
		System.out.println("a1 current balance: " + a1.getBalance());
		a1.deposit(1000.00);
		a1.withdrawal(2000.00);

		System.out.println("--------------");

		Account a2 = new Account();

		a2.setAccNumber("15454525659857");
		a2.setAccType("current");
		a2.setBalance(7000.00);

		System.out.println("a2 account number: " + a2.getAccNumber());
		System.out.println("a2 account type: " + a2.getAccType());
		System.out.println("a2 current balance: " + a2.getBalance());
		a2.deposit(500.00);
		a2.withdrawal(8000.00);

	}

}
