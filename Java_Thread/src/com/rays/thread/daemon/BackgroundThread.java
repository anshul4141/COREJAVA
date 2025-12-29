package com.rays.thread.daemon;

public class BackgroundThread extends Thread {

	String name = null;

	public BackgroundThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (true) {

			try {

				Thread.sleep(200);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(name);
		}
	}
}
