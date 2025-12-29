package com.rays.basic;

public class TestCharArray {
	
	public static void main(String[] args) {
		
		char[] c = {'a', 'b' , 'c', 'd'};
		

		System.out.println(c[0]);
		System.out.println("-------");
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(i + " = " + c[i]);
		}
		
		System.out.println("-------");
		for(char a : c) {
			System.out.println(a);
		}
		
	}

}
