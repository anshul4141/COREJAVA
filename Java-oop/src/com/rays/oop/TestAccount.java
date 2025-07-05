package com.rays.oop;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setAccNumber("5448787656589");
		a.setAccType("saving");
		a.setBalance(1000.0);

		System.out.println("account no: " + a.getAccNumber());
		System.out.println("account type: " + a.getAccType());
		System.out.println("current balance: " + a.getBalance());
		
		a.deposit(500.0);
		a.withdrawal(200);
		

	}

}
