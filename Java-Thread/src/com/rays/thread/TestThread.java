package com.rays.thread;

public class TestThread {

	public static void main(String[] args) {

		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("Shyam");

		t1.setPriority(10);
		
		t1.start();
		t2.start();

	}

}
