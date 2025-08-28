package com.rays.collection.genric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGenric {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(10);
		list.add(6);
		list.add(7);

		System.out.println(list);
		System.out.println("-----");
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
	}

}
