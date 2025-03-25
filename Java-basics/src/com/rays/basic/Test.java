package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) throws ParseException {

		String name = "google";
		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int i = 0; i < name.length(); i++) {

				if (ch == name.charAt(i)) {

					count++;

				}

			}

			if (count != 0) {

				System.out.println(ch + " = " + count);

			}
			count = 0;

		}

	}

}
