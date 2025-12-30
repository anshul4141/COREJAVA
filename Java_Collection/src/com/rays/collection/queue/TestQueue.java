package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

// fifo - first in first out
public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer('a');
		q.offer('b');
		q.offer('c');

		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
