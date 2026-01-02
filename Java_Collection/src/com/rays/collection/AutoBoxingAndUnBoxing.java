package com.rays.collection;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {

		int a = 5;
		// Integer b = new Integer(a); //old AutoBoxing
		Integer b = a; // new AutoBoxing

		int k = b; // UnBoxing

		System.out.println("---------------");
		
		System.out.println(Integer.max(5, 10));
		
		System.out.println("---------");
		
		String str = "45";
		int c = Integer.parseInt(str); // parse string to int
		System.out.println(c);

		System.out.println("---------");
		
		String s = String.valueOf(c); // parse int to string
		System.out.println(s);
	}

}
