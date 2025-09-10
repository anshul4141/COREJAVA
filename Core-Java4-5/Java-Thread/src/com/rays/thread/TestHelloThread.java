package com.rays.thread;

public class TestHelloThread {

	public static void main(String[] args) throws Exception {

		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("Shyam");
		
		t1.setPriority(9);
		t2.setPriority(3);

		t1.start();
		t2.start();

	}

}
