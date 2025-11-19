package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p1 = new Person();

		p1.setName("Ram");
		p1.setDob(sdf.parse("2002-02-02"));
		p1.setAddress("Indore");
		
		System.out.println("p1 name: " + p1.getName());
		System.out.println("p1 dob: " + p1.getDob());
		System.out.println("p1 address: " + p1.getAddress());
		System.out.println("p1 age: " + p1.getAge(p1.getDob()));

		System.out.println("------------------");

		Person p2 = new Person();

		p2.setName("Shyam");
		p2.setDob(sdf.parse("2009-09-09"));
		p2.setAddress("Bhopal");

		System.out.println("p2 name: " + p2.getName());
		System.out.println("p2 dob: " + p2.getDob());
		System.out.println("p2 address: " + p2.getAddress());
		System.out.println("p2 age: " + p2.getAge(p2.getDob()));

	}

}
