package com.rays.collection.list;

import java.util.Stack;

// lifo - last in first out
public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}

		System.out.println(s);

		System.out.println(s.pop()); // pop remove last element from stack

		System.out.println(s);

		System.out.println(s.peek()); // only get last element but not remove

		System.out.println(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		System.out.println(s);

	}

}
