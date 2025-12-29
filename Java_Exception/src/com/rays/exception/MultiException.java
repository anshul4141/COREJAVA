package com.rays.exception;

public class MultiException {

	public static void main(String[] args) {

		String name = "rays";

		try {
			System.out.println(name.length()); // NullPointerException
			System.out.println(name.charAt(4)); // IndexOutOfBound
		} catch (NullPointerException e) {
			System.out.println("exception1: " + e.getMessage());
		} catch(IndexOutOfBoundsException e) {
			System.out.println("exception2: " + e.getMessage());
		}

	}

}
