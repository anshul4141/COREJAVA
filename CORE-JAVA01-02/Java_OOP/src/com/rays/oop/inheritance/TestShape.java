package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("----circle----");
		Circle c = new Circle();

		c.setColor("Red");
		c.setBorderWidth(2);
		c.setRadius(4);

		System.out.println("color: " + c.getColor());
		System.out.println("borderWidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();
		
		System.out.println("----rectangle----");
		Rectangle r = new Rectangle();
		
		r.setColor("blue");
		r.setBorderWidth(3);
		r.setLength(4);
		r.setWidth(8);
		
		System.out.println("color: " + r.getColor());
		System.out.println("borderWidth: " + r.getBorderWidth());
		System.out.println("lenght: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		r.area();

	}

}
