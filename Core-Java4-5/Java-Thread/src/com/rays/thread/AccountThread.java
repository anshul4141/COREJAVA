package com.rays.thread;

public class AccountThread extends Thread {

	static Account a = new Account();

	public String name;

	public AccountThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				a.deposit(name, 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
