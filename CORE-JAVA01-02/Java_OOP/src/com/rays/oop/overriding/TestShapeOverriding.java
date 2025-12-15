package com.rays.oop.overriding;

public class TestShapeOverriding {

	public static void main(String[] args) {

		Shape s1 = new Circle();

		Circle c = (Circle) s1;
		c.setColor("red");
		c.setBorderWidth(2);
		c.setRadius(4);

		System.out.println("color: " + c.getColor());
		System.out.println("borderWidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();

		System.out.println("---------------");

		Shape s2 = new Triangle();

		Triangle t = (Triangle) s2;
		t.setColor("blue");
		t.setBorderWidth(2);
		t.setBase(3);
		t.setHight(4);

		System.out.println("color: " + t.getColor());
		System.out.println("borderWidth: " + t.getBorderWidth());
		System.out.println("base: " + t.getBase());
		System.out.println("hight: " + t.getHight());
		t.area();

		Shape s3 = new Rectangle();

		System.out.println("to-do");

	}

}
