package com.rays.collection.streamApi;

import java.util.ArrayList;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("kamal");
		list.add("aman");
		list.add("pawan");
		list.add("tarun");
		list.add("uday");
		list.add("tanmay");
		list.add("tanmay");

		System.out.println("------list-------");
		list.forEach(System.out::println);

		System.out.println("------list in uppser case-------");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("------list in lower case-------");
		list.stream().map(e -> e.toLowerCase()).forEach(System.out::println);

	}

}
