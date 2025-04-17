package com.rays.collection.streamApi;

import java.util.ArrayList;
import java.util.List;

public class OddEvenByStream {

	public static boolean oddEven(int i) {

		if (i % 2 == 0) {

			System.out.println(i + " = even ");

			return true;

		} else if (i % 2 != 0) {

			System.out.println(i + " = odd ");

			return true;

		}
		return false;

	}
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		//list.stream().distinct().filter(c -> oddEven(c)).forEach(c -> System.out.println());

		list.stream().distinct().filter(c -> (c % 2 == 0)).forEach(c -> System.out.println("even = " + c));
		list.stream().distinct().filter(c -> (c % 2 != 0)).forEach(c -> System.out.println("odd = " + c));

	}

}
