package com.rays.stream;

import java.util.ArrayList;

public class TestStream {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		System.out.println("list: " + list);

		list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("even: " + e));
		list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println("odd: " + e));

	}

}
