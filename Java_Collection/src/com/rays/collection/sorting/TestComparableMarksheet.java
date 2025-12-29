package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableMarksheet {

	public static void main(String[] args) {

		ArrayList<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet("105", "Baldev", 36));
		list.add(new Marksheet("101", "Puneet", 66));
		list.add(new Marksheet("103", "Ramdulera", 62));
		list.add(new Marksheet("102", "DeepkKalal", 33));
		list.add(new Marksheet("104", "SalmanKhan", 78));
		list.add(new Marksheet("106", "VarunDhanvan", 23));

		list.forEach(System.out::println);
		
		System.out.println("------sorted marksheet------");
		
		Collections.sort(list); // use comparable interface
		
		list.forEach(System.out::println);

	}

}
