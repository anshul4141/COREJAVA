package com.rays.oop;

public class Ram extends Student {

	public Ram() {
		super();
		System.out.println("this is default constructor of ram");
	}

	public Ram(String name) {
		super(name);
	}

	public Ram(String name, int rollNo) {
		super(name, rollNo);
	}

	public Ram(String name, int rollNo, String subject) {
		super(name, rollNo, subject);
	}

}
