package in.javacomics.concurrency;

import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.datastructures.queue.LinkedListBasedQueue;

public class LinkeListBasedQueueTest {
	
	private Queue<String> testQueue; 

	@Before
	public void setUp() throws Exception {
		testQueue=new LinkedListBasedQueue<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_add_remove() {
		testQueue.add("Element 1");
		testQueue.add("Element 2");
		testQueue.add("Element 3");
		testQueue.add("Element 4");
		System.out.println(testQueue);
		testQueue.remove();
		System.out.println(testQueue);
		testQueue.remove();
		testQueue.remove();
		System.out.println(testQueue);
	}

}
