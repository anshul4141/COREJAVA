package com.rays.oop.constructor;

public class Person {

	protected String firstName;
	protected String lastName;
	protected String address;

	public Person() {
		System.out.println("this is default constructor of Person");
	}

	public Person(String firstName) {
		this();
		this.firstName = firstName;
		System.out.println(this.firstName);
	}

	public Person(String firstName, String lastName) {
		this(firstName);
		this.lastName = lastName;
		System.out.println(this.lastName);
	}

	public Person(String firstName, String lastName, String address) {
		this(firstName, lastName);
		this.address = address;
		System.out.println(this.address);
	}

}
