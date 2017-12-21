package in.javacomics.datastructures.queue;

import static org.junit.Assert.*;

import java.util.Deque;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListBasedDequeTest {
	
	private Deque<String> deque;

	@Before
	public void setUp() throws Exception {
		deque=new DoublyLinkedListBasedDeque<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddToFront() {
		deque.addFirst("Akhilesh");
		deque.addFirst("Amit");
		deque.addFirst("Arnab");
		deque.addFirst("Ashutosh");
		assertEquals("Ashutosh", deque.getFirst());
		System.out.println(deque);
	}
	
	@Test
	public void testAddToRear() {
		deque.addLast("Akhilesh");
		deque.addLast("Amit");
		deque.addLast("Arnab");
		deque.addLast("Ashutosh");
		System.out.println(deque);
		
	}
	
	@Test
	public void testRemoveFromFront() {
		deque.addLast("Akhilesh");
		deque.addLast("Amit");
		deque.addLast("Arnab");
		deque.addLast("Ashutosh");
		String removedElement = deque.removeFirst();
		assertEquals("Akhilesh",removedElement );
		System.out.println(removedElement);
		System.out.println(deque);
	}

}
