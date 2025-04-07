package com.rays.oop;

public class Student {

	private String name;
	private int rollNo;
	private String subject;

	public Student() {
		System.out.println("this is default constructor of student");
	}

	public Student(String name) {
		this();
		this.name = name;
		System.out.println("name = " + this.name);
	}

	public Student(String name, int rollNo) {
		this(name);
		this.rollNo = rollNo;
		System.out.println("rollNo = " + this.rollNo);
	}

	public Student(String name, int rollNo, String subject) {
		this(name, rollNo);
		this.subject = subject;
		System.out.println("subject = " + this.subject);
	}

}
