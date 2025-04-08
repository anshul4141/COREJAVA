package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) throws InsufficentFundTranser {

		double balance = 1000.0;
		double withdrawalAmt = 500.0;

		if (withdrawalAmt > balance) {

			throw new InsufficentFundTranser("insufficent fund transer");

		} else {

			balance = balance - withdrawalAmt;
			System.out.println(balance);

		}

	}

}
