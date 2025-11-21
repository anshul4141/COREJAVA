package com.rays.oop.constructor;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a1 = new Account("5454554554", "saving", 50000.00);
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
		
	}

}
