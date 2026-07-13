package com.rays.oop.encapsulation;

import java.util.Date;

// void means no return type
// you can call class attribute using (this) key word

public class Person {

	// class attributes
	private String name;
	private Date dob;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public int getAge() {

		Date d = new Date();

		int age = d.getYear() - this.dob.getYear();

		return age;

	}

}
