package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamHighestSalary {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(1000);
		list.add(5000);
		list.add(2000);
		list.add(4000);
		list.add(3000);

		System.out.println("---first highest---");
		list.stream().distinct().max(Comparator.naturalOrder()).ifPresent(System.out::println);

		System.out.println("---second highes---");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

		System.out.println("---bubble short using stream desc order---");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);

		System.out.println("---bubble short using stream asc order---");
		list.stream().distinct().sorted().forEach(System.out::println);

	}

}
