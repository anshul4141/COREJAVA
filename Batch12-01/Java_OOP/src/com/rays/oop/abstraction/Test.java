package com.rays.oop.abstraction;

public class Test {

	public static void main(String[] args) {

		Light l = new WebApp();
		
		l.lightTheme();
		
		System.out.println("----------");
		
		Dark d = new WebApp();
		
		d.darkTheme();

	}

}
