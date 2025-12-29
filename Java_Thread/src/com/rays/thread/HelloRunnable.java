package com.rays.thread;

public class HelloRunnable implements Runnable {

	private String name;

	public HelloRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}

}
