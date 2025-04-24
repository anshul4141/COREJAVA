package com.rays.thread;

public class AccountThread extends Thread {

	String name;

	public static Account a = new Account();

	public AccountThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			a.deposite(name, 1000);
		}
	}

}
