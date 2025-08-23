package com.rays.excpeption;

public class TestAccount {

	public static void main(String[] args) throws InsufficentFundException {

		double balance = 1000.0;

		double withdrawalAmount = 200.0;

		if (withdrawalAmount > balance) {
			//System.out.println("insufficent fund transfer");
			throw new InsufficentFundException();
		} else {
			balance = balance - withdrawalAmount;
			System.out.println(balance);
		}
		
		System.out.println("transaction successfully");

	}

}
