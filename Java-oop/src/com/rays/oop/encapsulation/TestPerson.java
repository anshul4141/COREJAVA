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

		System.out.println("--------------------");

		Person p1 = new Person();
		p1.setName("Shyam");
		System.out.println("name = " + p1.getName());
		p1.setAddress("Ujjai");
		System.out.println("address = " + p1.getAddress());
		p1.setDob(sdf.parse("2003-03-03"));
		System.out.println(sdf.format(p1.getDob()));
	}

}
