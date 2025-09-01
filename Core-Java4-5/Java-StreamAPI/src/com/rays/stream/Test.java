package com.rays.stream;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Uday");
		list.add("Karan");
		list.add("Arjun");
		list.add("Tarun");
		list.add("Tanmay");
		list.add("Bheem");
		list.add("Kaliya");
		list.add("Kaliya");
		list.add("Kaliya");
		list.add("Tushar");

		list.forEach(System.out::println);
		System.out.println("----");
		list.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println("----");
		list.stream().distinct().sorted().forEach(e -> System.out.println(e));
		System.out.println("----");
		list.stream().filter(e -> e.startsWith("T")).forEach(e -> System.out.println(e));
		System.out.println("----");
		list.stream().distinct().limit(3).forEach(e -> System.out.println(e));

	}
}