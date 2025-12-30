package com.rays.collection.list;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {

		List list = new LinkedList();

		list.add(0, "Ram");
		list.add(1, "Ram");
		list.add(2, "Shyam");
		list.add(3, null);
		list.add(4, null);
		list.add(5, 5.2);
		list.add(6, 'a');
		list.add(7, true);
		
		System.out.println(list);

		System.out.println(list.get(6));

	}

}
