package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p = new Person();
		
		p.setName("Ram");
		System.out.println(p.getName());
		
		p.setDob(sdf.parse("2001-01-25"));
		System.out.println(sdf.format(p.getDob()));
		
		p.setAddress("indore");
		System.out.println(p.getAddress());
		System.out.println("age: " + p.getAge());
		
		Person p1 = new Person();
		
		p1.setName("Shyam");
		System.out.println(p1.getName());
		
		p1.setAddress("ujjain");
		System.out.println(p1.getAddress());
		
		p1.setDob(sdf.parse("2002-02-02"));
		System.out.println(p1.getDob());
		System.out.println("age: " + p1.getAge());
		
		
		
	}

}
