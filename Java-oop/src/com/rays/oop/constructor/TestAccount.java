package com.rays.oop.constructor;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account("54545454", 5000);

		System.out.println(a.getAccoutNumber());
		System.out.println(a.getBalance());

	}

}
