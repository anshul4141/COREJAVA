package com.rays.oop.dataabstraion;

public class Busnessman extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOther() {

		System.out.println("Help to other...");

	}

	@Override
	public void earnMoney() {

		System.out.println("earn money...");

	}

	@Override
	public void donation() {

		System.out.println("give donation...");

	}

	@Override
	public void party() {

		System.out.println("maja nii life....");

	}

}
