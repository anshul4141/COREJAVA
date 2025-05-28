package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {

		// Collection is a interface
		// Collections is a class

		List list = new ArrayList();

		list.add(5);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);

		System.out.println("list: " + list);
		Collections.sort(list);
		System.out.println("list: " + list);
		Collections.shuffle(list);
		System.out.println("list: " + list);

	}

}
