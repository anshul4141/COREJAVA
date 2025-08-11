package com.rays.oop;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;

	public static final int AVG_AGE = 18;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getAge() {
		Date now = new Date();

		int age = now.getYear() - dob.getYear();

		if (age >= AVG_AGE && age < 61) {
			System.out.println("age: " + age);
			System.out.println("adult");
		} else if (age > 61) {
			System.out.println("age: " + age);
			System.out.println("senior citizen");
		}
	}

}
