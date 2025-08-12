package com.rays.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {

		Account a2 = new Account();

		Account a = new Account("789858785888", "saving", 2000.0);

		System.out.println("account no: " + a.getAccountNo() + "\n" + "accountType: " + a.getAccountType() + "\n"
				+ "current balance: " + a.getBalance());

	}

}
