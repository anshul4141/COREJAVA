package com.rays.thread;

public class Account {

	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public synchronized void deposite(String name, int amount) {

		int total = balance + amount;

		setBalance(total);

		System.out.println(name + " deositing " + amount);

		System.out.println("Total balance in account: " + getBalance());

	}
}
