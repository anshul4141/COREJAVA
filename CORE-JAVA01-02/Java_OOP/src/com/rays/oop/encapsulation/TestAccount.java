package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a1 = new Account();

		a1.setNumber("7878585985785");
		a1.setAccountType("saving");
		a1.setBalance(100);

		System.out.println("a1 accountNumber: " + a1.getNumber());
		System.out.println("a1 accountType: " + a1.getAccountType());
		System.out.println("a1 current balance: " + a1.getBalance());

		System.out.println("---------------");

		Account a2 = new Account();

		a2.setAccountType("current");
		a2.setNumber("121212");
		a2.setBalance(50);

		System.out.println("a2 accountNumber: " + a2.getNumber());
		System.out.println("a2 accountType: " + a2.getAccountType());
		System.out.println("a2 current balance: " + a2.getBalance());

		System.out.println("------");
		a1.fundTransfer(a2, 50);
		
		System.out.println("a1 current balance: " + a1.getBalance());
		System.out.println("a2 current balance: " + a2.getBalance());

	}

}
