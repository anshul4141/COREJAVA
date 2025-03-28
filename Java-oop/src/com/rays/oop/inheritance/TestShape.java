package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("----circle----");

		Circle c = new Circle();
		c.setColor("Red");
		c.setBorderWidth(3);
		c.setRadius(2);

		System.out.println("color = " + c.getColor());
		System.out.println("border width = " + c.getBorderWidth());
		System.out.println("radius = " + c.getRadius());
		System.out.println("area of circle = " + c.area());

		System.out.println("----rectangle----");
		Rectangle r = new Rectangle();
		r.setLenght(2);
		r.setWidth(2);
		r.setColor("Blue");
		r.setBorderWidth(5);

		System.out.println("lenght = " + r.getLenght());
		System.out.println("width = " + r.getWidth());
		System.out.println("color = " + r.getColor());
		System.out.println("border width = " + r.getBorderWidth());
		System.out.println("area of Rectangle = " + r.area());
	}

}
