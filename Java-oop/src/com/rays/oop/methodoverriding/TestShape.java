package com.rays.oop.methodoverriding;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Circle(2);
		System.out.println("area of circle " + s.area());

		System.out.println("--------------");

		Shape s1 = new Rectangle(2, 2);
		System.out.println("area of rectangle " + s1.area());

	}

}
