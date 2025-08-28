package com.rays.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(5);
		l.add("Ram");
		l.add('a');
		l.add(5.3);
		l.add(true);

		System.out.println(l);

		System.out.println("-----for each loop-----");
		
		for (Object o : l) {
			System.out.println(o);
		}

		System.out.println("----iterator----");

		Iterator it = l.iterator();

		while (it.hasNext()) {

			Object o = it.next();
			System.out.println(o);

		}

	}

}
