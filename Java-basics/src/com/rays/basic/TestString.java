package com.rays.basic;

// string is non primitive data types and string is a class also
public class TestString {

	public static void main(String[] args) {

		String name = "Vijay Dinanath Chauhan";

		System.out.println("string lenght : " + name.length());
		System.out.println("7th char : " + name.charAt(6));
		System.out.println("Dina index of : " + name.indexOf("Dina"));
		System.out.println("a index of : " + name.indexOf("a"));
		System.out.println("a index of last : " + name.lastIndexOf("a"));
		System.out.println("a replace with b : " + name.replace("a", "b"));
		System.out.println("chota vijay : " + name.toLowerCase());
		System.out.println("bada vijay : " + name.toUpperCase());
		System.out.println("name start with vijay : " + name.startsWith("Vijay"));
		System.out.println("name ends with han : " + name.endsWith("han"));
		System.out.println("substring : " + name.substring(7));

	}

}
