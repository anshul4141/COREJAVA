package com.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {

	public static void main(String[] args) {

		LocalDate todayDate = LocalDate.now();

		System.out.println("today's date: " + todayDate);

		LocalDate birthDate = LocalDate.of(2001, 01, 25);

		System.out.println("your birth date: " + birthDate);

		Period period = Period.between(birthDate, todayDate);

		System.out.println(period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + " days ");

	}

}
