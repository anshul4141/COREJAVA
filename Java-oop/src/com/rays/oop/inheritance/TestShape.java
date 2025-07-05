package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		System.out.println("----rectangle----");
		Rectangle r = new Rectangle();

		r.setColor("red");
		r.setBorderWidth(5);
		r.setLenght(10);
		r.setWidht(20);

		System.out.println("color: " + r.getColor());
		System.out.println("borderWidth: " + r.getBorderWidth());
		System.out.println("lenght: " + r.getLenght());
		System.out.println("width: " + r.getWidht());
		System.out.println("area of rectangle: " + r.area());

		System.out.println("----triangle-----");
		Triangle t = new Triangle();

		t.setColor("blue");
		t.setBorderWidth(4);
		t.setBase(4);
		t.setHight(4);

		System.out.println("color: " + t.getColor());
		System.out.println("borderWidth: " + t.getBorderWidth());
		System.out.println("base: " + t.getBase());
		System.out.println("hight: " + t.getHight());
		System.out.println("area of triangle: " + t.area());

	}

}
