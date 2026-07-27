package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();

		list1.add("Java");
		list1.add("Spring");
		list1.add("Java");
		list1.add("Angular");
		list1.add("Spring");
		list1.add("React");

		List<String> list2 = new ArrayList<>();

		for (String str : list1) {

			if (!list2.contains(str)) {
				list2.add(str);
			}
		}

		System.out.println("Original List : " + list1);
		System.out.println("New List      : " + list2);
	}
}