package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p1 = new Person();
		p1.setName("Akbar Mansuri");
		System.out.println(p1.getName());
		p1.setDob(sdf.parse("2002-02-02"));
		System.out.println(p1.getDob());
		p1.setAddress("Indore");
		System.out.println(p1.getAddress());
		System.out.println(p1.getAge(p1.getDob()));

		System.out.println("------");

		Person p2 = new Person();
		p2.setName("Vedik");
		System.out.println(p2.getName());
		p2.setDob(sdf.parse("2003-02-02"));
		System.out.println(p2.getDob());
		p2.setAddress("Bhopal");
		System.out.println(p2.getAddress());
		System.out.println(p2.getAge(p2.getDob()));
	}

}
