package com.rays.io.serialization;

import java.io.Serializable;

public class Account implements Serializable {

	public String accountNo;
	public transient double balance;

	public Account(String a, double b) {
		this.accountNo = a;
		this.balance = b;
	}

	public String toString() {
		return "accountNO: " + accountNo + " balance: " + balance;
	}

}