package com.rays.thread;

public class TestHelloThread {

	public static void main(String[] args) {

		// thread are born when create object using new keyword
		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("Shyam");

		// thread start when call start() method(start method call run method)
		t1.start();
		t2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + "Akbar");
		}

	}

}
