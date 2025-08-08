package com.rays.basic;

public class NoteCounter {

	public static void main(String[] args) {

		int[] notes = { 500, 200, 100 };

		int money = 6300;
		int count = 0;

		for (int note : notes) {
			count = money / note;
			System.out.println(note + " = " + count);
			money = money % note;
		}

	}

}
