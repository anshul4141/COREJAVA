package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(5);
		list.add("Ram");
		list.add('a');

		Iterator it = list.iterator();
		
		list.add(3.2);

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

	}

}
