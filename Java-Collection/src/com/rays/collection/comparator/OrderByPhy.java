package com.rays.collection.comparator;

import java.util.Comparator;

public class OrderByPhy implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		
		if(o1.phy == o2.phy) {
			
			return o1.rollNo - o2.rollNo;
			
		}
		
		return o1.phy - o2.phy;
	}

}
