package com.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

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
		System.out.println("--------------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("---------");
		list.stream().sorted().distinct().forEach(System.out::println);

		System.out.println("-----map method------");
		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		System.out.println("-----------------");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("-----fileter method-----");
		list.stream().filter(e -> e.startsWith("k")).distinct().forEach(System.out::println);

	}

}
