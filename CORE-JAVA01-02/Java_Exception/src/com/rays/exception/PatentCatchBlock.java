package com.rays.exception;

public class PatentCatchBlock {
	
	public static void main(String[] args) {

		String name = "SunilOs";

		try {
			System.out.println(name.length()); // NullPointerException
			System.out.println(name.charAt(4)); // IndexOutOfBound
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		} finally {
			System.out.println("always execute");
		}

	}

}
