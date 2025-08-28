package com.rays.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTestArrayListVsLinkedList {

	public static void main(String[] args) {
		int size = 100000; // number of elements

		// Test ArrayList
		List<Integer> arrayList = new ArrayList<Integer>();
		long start = System.currentTimeMillis();

		// Insert elements at the end
		for (int i = 0; i < size; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList insertion time slow: " + (end - start) + " ms");

		// Access elements
		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			int x = arrayList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList access time fast: " + (end - start) + " ms");

		// Test LinkedList
		List<Integer> linkedList = new LinkedList<Integer>();
		start = System.currentTimeMillis();

		// Insert elements at the end
		for (int i = 0; i < size; i++) {
			linkedList.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList insertion time fast: " + (end - start) + " ms");

		// Access elements
		start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			int x = linkedList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList access time slow: " + (end - start) + " ms");
	}

}
