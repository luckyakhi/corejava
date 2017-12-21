package in.javacomics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.datastructures.stack.ArrayStack;
import in.javacomics.datastructures.stack.Stack;
import in.javacomics.datastructures.stack.StackEmptyException;

public class ArrayStackTest {

	private Stack<String> books;
	
	@Before
	public void setUp() throws Exception {
		books = new ArrayStack<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPush() throws StackEmptyException {
		books.push("Data Structures and Algorithms");
		books.push("Complete Reference Unix");
		books.push("Complete Reference Java");
		books.push("Spring in Action");
		System.out.println(books);
		String topBook = books.pop();
		assertEquals("Spring in Action", topBook);
	}


}
