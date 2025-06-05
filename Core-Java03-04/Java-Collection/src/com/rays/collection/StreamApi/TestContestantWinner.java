package com.rays.collection.StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestContestantWinner {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("8985625475", "Ram Dulera"));
		list.add(new Contestant("7854523698", "Ballal Dev"));
		list.add(new Contestant("6985875415", "Puneet"));
		list.add(new Contestant("7854523698", "Ballal Dev"));
		list.add(new Contestant("75878", "Samay Rena"));
		list.add(new Contestant("789654123", "Katappa"));
		list.add(new Contestant("7885254789", "Rajmata shivgami"));
		list.add(new Contestant("4588", "Anna reddy"));

		// 1. get the phone no
		System.out.println("----phone no----");
		list.stream().map(e -> e.phone).forEach(System.out::println);

		// 2. get the valid phone no
		System.out.println("----valid phone no----");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);

		// 3. remove duplicate phone no
		System.out.println("----remove duplicate phone no----");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		// 4. shuffle phone no
		System.out.println("----shuffle phone no----");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(System.out::println);

		// 4. print three winners
		System.out.println("---winner are---");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
