package com.rays.oop.polymorphism;

public class TestPolymorphismByMethodArgument {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		System.out.println("lenght of shape array: " + s.length);

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(4);

		Rectangle r = (Rectangle) s[1];
		r.setLenght(4);
		r.setWidht(8);

		Triangle t = (Triangle) s[2];
		t.setBase(4);
		t.setHight(4);

		double totalArea = calcArea(s); // call calcArea() method and pass s argument it will return total area
		System.out.println(totalArea);

	}

	private static double calcArea(Shape[] s) {
		double totalArea = 0.0;
		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].area());
			totalArea = totalArea + s[i].area();
		}
		return totalArea;
	}

}
