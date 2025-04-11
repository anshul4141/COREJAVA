package com.rays.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer(5);
		q.offer(4);
		q.offer(3);
		q.offer(2);
		q.offer(1);

		System.out.println("queue: " + q);
		System.out.println("peek: " + q.peek());
		System.out.println("queue: " + q);
		System.out.println("poll: " + q.poll());
		System.out.println("queue: " + q);
		q.poll();
		System.out.println("queue: " + q);

	}

}
