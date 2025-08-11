package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p = new Person();

		p.setName("Ram");
		p.setAddress("Indore");
		p.setDob(sdf.parse("1962-01-01"));
		p.getAge();

		System.out.println("name: " + p.getName());
		System.out.println("address: " + p.getAddress());
		System.out.println("dob: " + p.getDob());

	}

}
