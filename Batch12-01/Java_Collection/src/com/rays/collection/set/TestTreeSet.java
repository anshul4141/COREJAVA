package com.rays.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

// SortedSet does not contain null element
// It is sorted in ASC order, null element can not be sorted its throw NullPointerException
public class TestTreeSet {

	public static void main(String[] args) {

		SortedSet s = new TreeSet();

//		s.add(null);
//		s.add(null);
		s.add('a');
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('d');

		System.out.println(s);

	}

}
