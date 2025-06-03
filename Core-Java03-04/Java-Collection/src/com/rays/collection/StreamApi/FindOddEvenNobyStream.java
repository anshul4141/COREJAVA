package com.rays.collection.StreamApi;

import java.util.ArrayList;
import java.util.List;

public class FindOddEvenNobyStream {

	public static boolean findOdd(int i) {

		if (i % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean findEven(int i) {

		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		list.stream().filter(e -> findOdd(e)).forEach(e -> System.out.println("odd: " + e));
		list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("even: " + e));

	}

}
