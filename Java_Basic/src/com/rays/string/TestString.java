package com.rays.string;

public class TestString {
	
	public static void main(String[] args) {

		String name = "Vijay Dinanath Chouhan";
		
		//String name = new String("Vijay Dinanath Chouhan");

		System.out.println("name = " + name);
		System.out.println("lenght: " + name.length());
		System.out.println("7th char is: " + name.charAt(6));
		System.out.println("first index of k: " + name.indexOf('k'));  // search from 0 index
		System.out.println("last index of a: " + name.lastIndexOf('a')); // search from last index
		System.out.println(name.replace('a', 'b')); // replace oldChar(a) with newChar(b)
		System.out.println("chota vijay: " + name.toLowerCase());
		System.out.println("bada vijay: " + name.toUpperCase());
		System.out.println(name.startsWith("Vijay"));
		System.out.println(name.endsWith("Han"));
		System.out.println(name.substring(6, 9));
		

	}

}
