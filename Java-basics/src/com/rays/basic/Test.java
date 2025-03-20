package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Person p = new Person();

		p.setName("Ram");
		String name = p.getName();
		p.setDob(sdf.parse("2001-02-02"));
		int age = p.ageFind(p.getDob());

		System.out.println(name + " = " + age);

	}

}
