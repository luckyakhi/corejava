package in.javacomics.datastructures.queue;

import static org.junit.Assert.*;

import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class CircularArrayBasedQueueTest {
	
	private Queue<String> queue;

	@Before
	public void setUp() throws Exception {
		queue= new CircularArrayBasedQueue<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testIterator() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testToArray() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testToArrayTArray() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testRemoveObject() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testContainsAll() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testAddAll() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testRemoveAll() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testRetainAll() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		queue.add("Element 1");
		queue.add("Element 2");
		queue.add("Element 3");
		displayQueueIndexes();
		assertEquals(3, queue.size());
		String removedElement = queue.remove();
		assertEquals(2, queue.size());
		assertEquals("Element 1", removedElement);
		removedElement = queue.remove();
		displayQueueIndexes();
		assertEquals(1, queue.size());
		assertEquals("Element 2", removedElement);
		queue.add("Element 4");
		queue.add("Element 5");
		queue.add("Element 6");
		displayQueueIndexes();
		assertEquals(4, queue.size());
		removedElement = queue.remove();
		assertEquals("Element 3", removedElement);
		removedElement = queue.remove();
		assertEquals("Element 4", removedElement);
		removedElement = queue.remove();
		assertEquals("Element 5", removedElement);
		displayQueueIndexes();
		assertEquals(1, queue.size());
		queue.add("Element 7");
		queue.add("Element 8");
		queue.add("Element 9");
		displayQueueIndexes();
		assertEquals(4, queue.size());
		removedElement = queue.remove();
		assertEquals("Element 6", removedElement);
		removedElement = queue.remove();
		assertEquals("Element 7", removedElement);
		removedElement = queue.remove();
		assertEquals("Element 8", removedElement);
		assertEquals(1, queue.size());
		displayQueueIndexes();
		queue.add("Element 10");
		queue.add("Element 11");
		queue.add("Element 12");
		displayQueueIndexes();
		removedElement = queue.remove();
		assertEquals("Element 9", removedElement);
		removedElement = queue.remove();
		assertEquals("Element 10", removedElement);
		removedElement = queue.remove();
		assertEquals("Element 11", removedElement);
		assertEquals(1, queue.size());
		displayQueueIndexes();
	}

	private void displayQueueIndexes() {
		int frontIndex = (int) ReflectionTestUtils.getField(queue, "frontIndex");
		int rearIndex = (int) ReflectionTestUtils.getField(queue, "rearIndex");
		System.out.println(frontIndex);
		System.out.println(rearIndex);
	}

	@Test
	@Ignore
	public void testOffer() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testPoll() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testElement() {
		fail("Not yet implemented");
	}

	@Test
	@Ignore
	public void testPeek() {
		fail("Not yet implemented");
	}

}
