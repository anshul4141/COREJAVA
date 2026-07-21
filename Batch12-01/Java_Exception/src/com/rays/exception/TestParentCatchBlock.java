package com.rays.exception;

public class TestParentCatchBlock {

	public static void main(String[] args) {

		String name = "Rays";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(4));
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}

	}

}
