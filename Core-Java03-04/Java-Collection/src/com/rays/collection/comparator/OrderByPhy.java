package com.rays.collection.comparator;

import java.util.Comparator;

public class OrderByPhy implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {

		return o2.phy - o1.phy;
	}

}
