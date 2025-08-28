package com.rays.collection.set;

import java.util.HashSet;
import java.util.Set;

//1.Set contain only unique value
//2.Set contain only one null value
//3.Order of set is sorting order in asc
public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add('c');
		s.add('a');
		s.add('d');
		s.add('b');
		s.add('a');
		s.add('a');
		s.add(null);
		s.add(null);
		
		System.out.println(s);

	}

}
