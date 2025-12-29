package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSorting {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add('b');
		list.add('a');
		list.add('c');
		
		System.out.println("list before sorting: " + list);
		
		Collections.sort(list);
		
		System.out.println("list after sorting: " + list);
		
		Collections.shuffle(list);
		
		System.out.println("list after shuffle: " + list);

	}

}
