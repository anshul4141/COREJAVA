package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('c');
		list.add('b');
		list.add('a');
		list.add('d');
		list.add('e');

		System.out.println("natural list: " + list);
		
		System.out.println("------------");
		
		Collections.sort(list);
		
		System.out.println("sorting list: " + list);

	}

}
