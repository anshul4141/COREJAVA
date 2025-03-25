package com.rays.basic;

public class TestArray {

	public static void main(String[] args) {

		int[] i = { 4, 5, 6, 7 };

		System.out.println(i[2]);

		System.out.println("---for loop---");
		
		System.out.println("lenght of array = " + i.length);
		
		for(int j = 0; j < i.length; j++) {
			
			System.out.println(i[j]);
			
		}

	}

}
