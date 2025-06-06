package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p = new Person();

		p.setName("Ram");
		System.out.println("name = " + p.getName());
		p.setDob(sdf.parse("2002-02-02"));
		System.out.println("dob = " + sdf.format(p.getDob()));
		p.setAddress("indore");
		System.out.println("address = " + p.getAddress());
		int age = Person.getAge(sdf.parse(sdf.format(p.getDob())));
		if (age < Person.AVR_AGE) {

			System.out.println("ram you are not eligible for vot becouse your age = " + age);

		} else {
			System.out.println("ram you are eligible for vot your age is = " + age);
		}

		System.out.println("--------------------");

		Person p1 = new Person();
		p1.setName("Shyam");
		System.out.println("name = " + p1.getName());
		p1.setAddress("Ujjain");
		System.out.println("address = " + p1.getAddress());
		p1.setDob(sdf.parse("2003-03-03"));
		System.out.println(sdf.format(p1.getDob()));
	}

}
