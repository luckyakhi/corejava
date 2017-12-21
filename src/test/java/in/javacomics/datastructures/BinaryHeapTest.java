package in.javacomics.datastructures;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinaryHeapTest {

	private Queue<String> priorityQueue;
	
	@Before
	public void setUp() throws Exception {
		priorityQueue = new PriorityQueue<String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		priorityQueue.add("Amit");
		priorityQueue.add("Arnab");
		priorityQueue.add("Ashutosh");
		priorityQueue.add("Akhilesh");
		priorityQueue.add("Manish");
		priorityQueue.add("Mayur");
		priorityQueue.add("Sandeep");
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
	}

}
