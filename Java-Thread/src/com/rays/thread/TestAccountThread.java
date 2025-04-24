package com.rays.thread;

public class TestAccountThread {

	public static void main(String[] args) {

		AccountThread t1 = new AccountThread("Ram");
		AccountThread t2 = new AccountThread("Shyam");

		t1.start();
		t2.start();

	}

}
