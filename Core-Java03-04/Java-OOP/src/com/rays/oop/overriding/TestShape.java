package com.rays.oop.overriding;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.setRadius(2);
		System.out.println(c.area());

		System.out.println("--------");
		
		Rectangle r = new Rectangle();
		r.setLenght(2);
		r.setWidth(2);
		System.out.println(r.area());

	}

}
