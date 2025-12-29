package com.rays.basic.exercise;

import java.util.Random;

public class GenerateRandomNo {

	// anshul
	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 0; i < 5; i++) {

			int randno = r.nextInt(100);

			System.out.println(randno);

		}

	}

}
