package com.rays.oop.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();
		a.setNumber("ASD45600UU");
		a.setAccountType("saving");
		a.setBalance(1000.00);

		System.out.println("account no = " + a.getNumber());
		System.out.println("account type = " + a.getAccountType());
		System.out.println("current balance = " + a.getBalance());

	}

}
