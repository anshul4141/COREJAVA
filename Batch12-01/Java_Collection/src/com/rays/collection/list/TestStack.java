package com.rays.collection.list;

import java.util.Stack;

// push() for insert
// peek() for print last element
// pop() for remove last element
public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}

		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

	}

}
