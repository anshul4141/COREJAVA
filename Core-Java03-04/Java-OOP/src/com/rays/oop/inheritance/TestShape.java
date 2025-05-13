package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		c.setColor("red");
		c.setBorderWidth(5);
		c.setRadius(2);

		System.out.println(c.getColor());
		System.out.println(c.getBorderWidth());
		System.out.println(c.getRadius());
		System.out.println(c.area());

		System.out.println("---------");

		Rectangle r = new Rectangle();

		r.setColor("blue");
		r.setBorderWidth(4);
		r.setLenght(2);
		r.setWidth(2);

		System.out.println(r.getColor());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getLenght());
		System.out.println(r.getWidth());
		System.out.println(r.area());

	}

}
