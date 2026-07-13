package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p = new Person();

		p.setName("Ram");
		p.setAddress("Indore");
		p.setDob(sdf.parse("2001-01-01"));

		System.out.println("name: " + p.getName());
		System.out.println("address: " + p.getAddress());
		System.out.println("dob: " + sdf.format(p.getDob()));
		System.out.println("age of ram: " + p.getAge());
		
		System.out.println("----------------------");
		
		Person p1 = new Person();
		
		p1.setName("Shyam");
		p1.setAddress("Ujjain");
		p1.setDob(sdf.parse("2002-02-02"));
		
		System.out.println("name: " + p1.getName());
		System.out.println("address: " + p1.getAddress());
		System.out.println("dob: " + sdf.format(p1.getDob()));
		System.out.println("age of shyam: " + p1.getAge());

	}

}
