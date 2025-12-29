package com.rays.thread.priority;

public class TestPriorityThread {

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("Ram");

		PriorityThread t2 = new PriorityThread("Shyam");

		// Set thread priorities
		t1.setPriority(10); // Maximum priority
		t2.setPriority(1); // Minimum priority

		t1.start();

		t2.start();
	}

}
