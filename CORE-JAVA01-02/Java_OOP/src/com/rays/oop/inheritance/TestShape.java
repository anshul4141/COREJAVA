package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("--------cirlce--------");
		Circle c = new Circle();

		c.setRadius(2);
		c.setColor("red");
		c.setBorderWidth(1);

		System.out.println("radius: " + c.getRadius()); // Child property
		System.out.println("color: " + c.getColor()); // Parent class property
		System.out.println("borderWidth: " + c.getBorderWidth()); // parent class property
		c.area();

		System.out.println("--------rectangle--------");
		Rectangle r = new Rectangle();

		r.setLenght(5);
		r.setWidht(10);
		r.setColor("blue");
		r.setBorderWidth(3);

		System.out.println("lenght: " + r.getLenght());
		System.out.println("width: " + r.getWidht());
		System.out.println("color: " + r.getColor());
		System.out.println("borderWidth: " + r.getBorderWidth());
		r.area();

	}

}
