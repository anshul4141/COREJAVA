package com.rays.oop;

public class Tata extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOther() {
		System.out.println("tata help to other");

	}

	@Override
	public void earnMoney() {
		System.out.println("tata earn money");

	}

	@Override
	public void donation() {
		System.out.println("donation");

	}

	@Override
	public void party() {
		System.out.println("tata doing party");

	}

}
