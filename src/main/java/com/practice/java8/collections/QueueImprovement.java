package com.practice.java8.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class QueueImprovement {
	private Queue<String> queue;
	private Queue<String> queue8;

	public QueueImprovement() {
		this.queue = new LinkedList<>();
		this.queue8 = Collections.checkedQueue(new LinkedList<>(), String.class);
	}

	Queue<String> getQueue() {
		return queue;
	}

	Queue<String> getQueue8() {
		return queue8;
	}

	String work() {
		return queue.stream().collect(Collectors.joining());
	}

	String work8() {
		return queue8.stream().collect(Collectors.joining());
	}

}

