package com.rays.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

// sorted set is ordered in asc
public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('c');
		s.add('a');
		s.add('b');

		System.out.println(s);

	}

}
