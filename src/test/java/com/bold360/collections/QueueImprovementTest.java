package com.bold360.collections;
import static org.junit.Assert.assertTrue;

import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

public class QueueImprovementTest {
	QueueImprovement queueImprovement;
	Queue testQueue;

	@Before
	public void setUp() throws Exception {
		queueImprovement = new QueueImprovement();
	}

	@Test
	public void testInsertQueue() throws Exception {
		testQueue = queueImprovement.getQueue();
		testQueue.add("Hello");
		testQueue.add(1);
		assertTrue("Unfortunately it is allowed because we forget the type parameter", testQueue.size() == 2);
	}

	@Test(expected = ClassCastException.class)
	public void testInsertAndExecuteQueue() throws Exception {
		testQueue = queueImprovement.getQueue();
		testQueue.add("Hello");
		testQueue.add(1);
		queueImprovement.work();
	}

	@Test(expected = ClassCastException.class)
	public void testInsertQueue8() throws Exception {
		testQueue = queueImprovement.getQueue8();
		testQueue.add(1);
	}
}