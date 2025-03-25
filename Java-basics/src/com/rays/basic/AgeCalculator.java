package com.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		LocalDate yourDob = LocalDate.of(2002, 01, 25);

		System.out.println("today date = " + now);
		System.out.println("your dob = " + yourDob);

		Period between = Period.between(yourDob, now);

		System.out.println("you age = " + between.getYears());

	}

}
