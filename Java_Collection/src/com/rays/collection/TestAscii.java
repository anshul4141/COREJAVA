package com.rays.collection;

public class TestAscii {

	public static void main(String[] args) {

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " = " + (int) c);
		}
		
		System.out.println("------------");
		
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " = " + (int) c);
		}
		
		System.out.println("------");
		
		char i = '0';
		
		System.out.println(i + " = " + (int) i);

	}

}
