package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormate {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		System.out.println("date before formate = " + date);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("date after formate = " + sdf.format(date));

		System.out.println("-------------------------------");
		String dob = "02/02/2002";
		Date myDob = sdf.parse(dob);
		System.out.println("MyDob = " + myDob);

	}

}
