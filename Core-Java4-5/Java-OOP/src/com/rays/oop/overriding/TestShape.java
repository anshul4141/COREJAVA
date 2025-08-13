package com.rays.oop.overriding;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("---circle---");
		Shape s = new Circle();

		// Shape object type cast into child class object here is Circle
		Circle c = (Circle) s;

		s.setColor("red");
		s.setBorderWidth(5);
		c.setRadius(10);

		System.out.println("color: " + s.getColor());
		System.out.println("border width: " + s.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		System.out.println("area of circle: " + s.area());

		System.out.println("---rectangle---");
		Shape s1 = new Rectangle();

		Rectangle r = (Rectangle) s1;
		r.setLenght(5);
		r.setWidht(5);

		System.out.println("area of rectangle: " + r.area());
	}

}
