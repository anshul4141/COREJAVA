package com.rays.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account("546546545", "saving", 5454.00);

//		a.setAccNo("546546545");
//		a.setAccType("saving");
//		a.setBalance(5454.00);

		System.out.println(a.getAccNo());
		System.out.println(a.getAccType());
		System.out.println(a.getBalance());

	}

}
