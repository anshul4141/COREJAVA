package com.rays.collection.list;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(0, "KGF");
		list.add(1, 1);
		list.add(2, 5.2);
		list.add(3, 'a');
		list.add(1, 2);

		System.out.println(list);

	}

}
