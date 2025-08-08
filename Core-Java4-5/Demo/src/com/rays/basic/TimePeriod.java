package com.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		System.out.println(now);

		System.out.println("-----------");

		LocalDate dob = LocalDate.of(2002, 9, 30);

		System.out.println(dob);

		Period p = Period.between(dob, now);

		System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());

	}

}
