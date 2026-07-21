package com.rays.exception;

public class TestMultiCatchBlock {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(4));
		} catch (NullPointerException e) {
			System.out.println("exception 1: " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("excpetion 2: " + e.getMessage());
		}

	}

}
