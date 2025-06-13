package com.rays.thread;

public class AccountThread extends Thread {

	public static Account a = new Account();

	public String name;

	public AccountThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			a.deposite(1000, name);
		}
	}

}
