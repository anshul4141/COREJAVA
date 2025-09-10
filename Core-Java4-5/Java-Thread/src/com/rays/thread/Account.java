package com.rays.thread;

public class Account {

	private int balance;

	public int getBalance() throws InterruptedException {
		Thread.sleep(200);
		return balance;
	}

	public void setBalance(int balance) throws InterruptedException {
		Thread.sleep(200);
		this.balance = balance;
	}

	public synchronized void deposit(String name, int amt) throws InterruptedException {

		int bal = getBalance();
		bal = bal + amt;
		setBalance(bal);
		System.out.println(name + " new balance " + getBalance());

	}

}