package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("====circle====");

		Circle c = new Circle();

		c.setColor("Red");
		c.setBorderWidth(1);
		c.setRadius(2);

		System.out.println("color: " + c.getColor());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();

		System.out.println("=====rectangle=====");

		Rectangle r = new Rectangle();

		r.setColor("Bule");
		r.setBorderWidth(4);
		r.setLenght(4);
		r.setWidth(2);

		System.out.println("color: " + r.getColor());
		System.out.println("borderwidth: " + r.getBorderWidth());
		System.out.println("lenght: " + r.getLenght());
		System.out.println("width: " + r.getWidth());
		r.area();

		System.out.println("====triangle====");

	}

}
