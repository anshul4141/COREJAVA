package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "7875896985"));
		list.add(new Contestant("Shyam", "6985878589"));
		list.add(new Contestant("Ajay", "6985878589"));
		list.add(new Contestant("Vijay", "7875896985"));
		list.add(new Contestant("Jay", "7875836985"));
		list.add(new Contestant("Pappu", "6585898587"));
		list.add(new Contestant("invalidNo", "78858"));

		// get phoneNo
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);

		System.out.println("--------------");

		// get valid phoneNo
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println);

		System.out.println("--------------");

		// remove duplicate phoneNo
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);
		
		System.out.println("--------------");
		
		// shuffle phoneNo
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);

	}

}
