package com.rays.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

// sorted set is order set in asc
public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('c');
		s.add('b');
		s.add('a');

		System.out.println(s);

	}

}
