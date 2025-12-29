package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamHighestSalary {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(1000);
		list.add(5000);
		list.add(2000);
		list.add(4000);
		list.add(3000);

		System.out.println("---first largest salary---");
		list.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.println("---second largest salary---");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);

	}

}
