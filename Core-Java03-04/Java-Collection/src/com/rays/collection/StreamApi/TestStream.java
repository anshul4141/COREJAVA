package com.rays.collection.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Tarun");
		list.add("Raman");
		list.add("Aman");
		list.add("Kamal");
		list.add("Pawan");
		list.add("Tarun");
		list.add("Tanmay");

		System.out.println("-----list-----");
		list.forEach(System.out::println);

		System.out.println("----list sorted by stream----");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("----remove duplicate from list----");
		list.stream().sorted().distinct().forEach(System.out::println);

		System.out.println("----list in upper case----");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);

		System.out.println("----list in lower case----");
		list.stream().distinct().sorted().map(e -> e.toLowerCase()).forEach(System.out::println);

		System.out.println("---list start with t---");
		list.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("t")).forEach(System.out::println);

	}

}
