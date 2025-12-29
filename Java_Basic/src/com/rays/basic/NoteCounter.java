package com.rays.basic;

public class NoteCounter {

	public static void main(String[] args) {

		int money = 6750;

		int[] notes = { 1000, 500, 200, 100, 50 };

		int count = 0;

		for (int note : notes) {
			count = money / note;
			if (count > 0) {
				System.out.println("total note of " + note + " is: " + count);
			}
			money = money % note;
		}

	}

}
