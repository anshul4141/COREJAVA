package com.rays.oop.constructor;

public class Ram extends Person {

	public Ram() {
		super();
		System.out.println("this is child default constructor");
	}

	public Ram(String firstName, String lastName, String address) {

		super(firstName, lastName, address);

	}

}
