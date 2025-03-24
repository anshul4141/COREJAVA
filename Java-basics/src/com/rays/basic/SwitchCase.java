package com.rays.basic;

public class SwitchCase {

	public static void main(String[] args) {

		String day = "Monday";

		switch (day) {
		case "Monday":
			System.out.println("this is 1st day of week");
			break;
		case "tuesday":
			System.out.println("this is 2nd day of week");
			break;
		case "wed":
			System.out.println("this is 3rd day of week");
			break;
		default:
			System.out.println("this day yet to come");
			break;
		}

	}

}
