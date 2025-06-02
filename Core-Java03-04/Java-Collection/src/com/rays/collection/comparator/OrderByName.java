package com.rays.collection.comparator;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {

		return o2.name.compareTo(o1.name);
	}

}
