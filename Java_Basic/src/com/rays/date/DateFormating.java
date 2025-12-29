package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println("default format date: " + d);

		String s = sdf.format(d);

		System.out.println("format date: " + s);

		System.out.println("----------------------");
		
		String dob = "2004-06-05";
		
		System.out.println("string dob: " + dob);
		
		Date date = sdf.parse(dob);
		
		System.out.println("date dob: " + date);

	}

}
