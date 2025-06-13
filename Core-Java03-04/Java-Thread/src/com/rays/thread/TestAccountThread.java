package com.rays.thread;

public class TestAccountThread {

	public static void main(String[] args) {

		AccountThread a1 = new AccountThread("Ram");
		AccountThread a2 = new AccountThread("Shyam");
		
		a1.start();
		a2.start();

	}

}
