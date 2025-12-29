package com.rays.oop.overriding;

public class TestShape2 {

	public static void main(String[] args) {

		// parents can keep child's reference
		Shape s1 = new Circle();

		// type cast Shape s1 to Circle c
		Circle c = (Circle) s1;
		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(2);

		System.out.println("color: " + c.getColor());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();
		
		Shape s2 = new Triangle();
		
		Triangle t = (Triangle) s2;

	}

}
