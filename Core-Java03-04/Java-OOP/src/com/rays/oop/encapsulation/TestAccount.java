package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();

		a.setAccountNo("1100112200");
		System.out.println("account no: " + a.getAccountNo());
		a.setAccountType("saving");
		System.out.println("account type: " + a.getAccountType());
		a.setBalance(1000.0);
		System.out.println("current balance: " + a.getBalance());
		
		a.deposite(500.0);
		a.withdrawal(200.0);

	}

}
