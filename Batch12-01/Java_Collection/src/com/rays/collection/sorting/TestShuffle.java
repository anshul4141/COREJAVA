package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestShuffle {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('c');
		list.add('b');
		list.add('a');
		list.add('d');
		list.add('e');

		System.out.println("natural list: " + list);
		
		System.out.println("------------");
		
		Collections.shuffle(list);
		
		System.out.println("shuffle list: " + list);

	}

}
