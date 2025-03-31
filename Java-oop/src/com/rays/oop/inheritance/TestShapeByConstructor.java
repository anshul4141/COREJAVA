package com.rays.oop.inheritance;

public class TestShapeByConstructor {

	public static void main(String[] args) {

		Circle1 c = new Circle1(2);
		System.out.println("radius = " + c.getRadius());
		System.out.println("area of circle = " + c.area());
		System.out.println("--------------");

		Rectangle1 r = new Rectangle1(2, 2);
		System.out.println("lenght = " + r.getLenght());
		System.out.println("widht = " + r.getWidth());
		System.out.println("area of rectangle = " + r.area());

	}

}
