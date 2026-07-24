package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

// set contain only unique elements
// HashSet contain only one null elements
// order of HashSet is not define
public class TestHashSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(null);
		s.add(null);
		s.add('a');
		s.add('a');
		s.add('b');
		s.add('c');
		s.add('d');

		System.out.println(s);

	}

}
