package com.rays.basic;

public class TestString {

	public static void main(String[] args) {

		String name = "Vijay Dinanath Chouhan";

		System.out.println("name: " + name);
		System.out.println("lenght: " + name.length());
		System.out.println("7th char: " + name.charAt(6));
		System.out.println("index of a is: " + name.indexOf('a'));
		System.out.println("last index of a is: " + name.lastIndexOf('a'));
		System.out.println("a replace by b: " + name.replace('a', 'b'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Vijay "));
		System.out.println(name.endsWith("han"));
		System.out.println(name.substring(6));

	}

}
