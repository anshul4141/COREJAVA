package com.rays.oop.polymorphism;

public class TestShapeByArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);
		System.out.println("radius: " + c.getRadius());
		System.out.println("area of circle: " + s[0].area());

		System.out.println("-----------");

		Rectangle r = (Rectangle) s[1];
		r.setLenght(2);
		r.setWidth(2);
		System.out.println("lenght: " + r.getLenght());
		System.out.println("widht: " + r.getWidth());
		System.out.println("area of rectangle: " + s[1].area());

		System.out.println("-----------");

		Triangle t = (Triangle) s[2];
		t.setBase(2);
		t.setHight(2);
		System.out.println("base: " + t.getBase());
		System.out.println("hight: " + t.getHight());
		System.out.println("area of triangle: " + s[2].area());

	}

}
