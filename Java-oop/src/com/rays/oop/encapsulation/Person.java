package com.rays.oop.encapsulation;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	public static final int AVR_AGE = 18;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static int getAge(Date dob) {

		Date now = new Date();

		int currentYear = now.getYear();
		int dobYear = dob.getYear();

		int age = currentYear - dobYear;
		return age;

	}
}
