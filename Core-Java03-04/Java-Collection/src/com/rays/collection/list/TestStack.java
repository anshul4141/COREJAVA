package com.rays.collection.list;

import java.util.Stack;

// last in first out first in last out
public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push('a');
		s.push('b');
		s.push('c');

		System.out.println("stack: " + s);

		System.out.println(s.peek());
		
		System.out.println("stack: " + s);
		
		System.out.println(s.pop());
		
		System.out.println("stack: " + s);

	}

}
