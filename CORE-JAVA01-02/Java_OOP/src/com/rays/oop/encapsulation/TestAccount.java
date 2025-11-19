package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account();

		a1.setNumber("45858854595855");
		a1.setAccountType("current");
		a1.setBalance(1000.00);

		System.out.println("a1 account no: " + a1.getNumber());
		System.out.println("a1 account type: " + a1.getAccountType());
		System.out.println("a1 current balance: " + a1.getBalance());
		a1.deposit(500.00); // 1500.00
		a1.withdrawal(200.00); // 1300.00
		a1.withdrawal(200.00); //

	}

}
