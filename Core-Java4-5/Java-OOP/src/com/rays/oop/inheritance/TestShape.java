package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("---circle---");

		Circle c = new Circle();

		c.setColor("red");
		c.setBorderWidth(3);
		c.setRadius(10);

		System.out.println("color: " + c.getColor());
		System.out.println("border width: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		System.out.println("area of circle: " + c.area());

		System.out.println("---rectangle---");

		Rectangle r = new Rectangle();

		r.setColor("Blue");
		r.setBorderWidth(5);
		r.setLenght(5);
		r.setWidht(5);

		System.out.println("color: " + r.getColor());
		System.out.println("border widht: " + r.getBorderWidth());
		System.out.println("lenght: " + r.getLenght());
		System.out.println("widht: " + r.getWidht());
		System.out.println("area of rectangle: " + r.area());
	}

}
