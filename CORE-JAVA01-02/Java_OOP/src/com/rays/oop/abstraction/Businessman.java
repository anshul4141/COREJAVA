package com.rays.oop.abstraction;

public class Businessman extends Person implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earn money ...!");
	}

	@Override
	public void donation() {
		System.out.println("give donation ...!");
	}

	@Override
	public void party() {
		System.out.println("doing party ...!");
	}

	@Override
	public void helpToOther() {
		System.out.println("help to other ...!");
	}

}
