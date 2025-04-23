package com.rays.thread;

public class HelloThread extends Thread {

	String name;

	public HelloThread(String name) {

		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(1000);
				System.out.println(i + " = " + name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
