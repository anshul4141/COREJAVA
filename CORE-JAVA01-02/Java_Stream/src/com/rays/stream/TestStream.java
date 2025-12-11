package com.rays.stream;

import java.util.ArrayList;

public class TestStream {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Tarun");
		list.add("Raman");
		list.add("Bahubali");
		list.add("Karan");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Uday");

		list.forEach(System.out::println);
		System.out.println("--------------");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("---------");
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("-----filter method------");
		list.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("k")).distinct().forEach(System.out::println);

	}

}
