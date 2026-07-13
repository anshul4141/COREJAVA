package com.rays.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

// SortedSet is order set in asc
// does not contain null value
// does not contain duplicate value
public class TestSortedSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

		s.add('c');
		s.add('b');
		s.add('a');

		System.out.println(s);

	}

}
