package com.rays.string;

public class CountAccuranceOfOneChar {

	public static void main(String[] args) {

		String str = "google";
		int count = 0;

		char c = 'o';

		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("count of " + c + " is: " + count);

	}

}
