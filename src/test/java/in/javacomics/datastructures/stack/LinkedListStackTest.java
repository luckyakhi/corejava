package in.javacomics.datastructures.stack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListStackTest {
	private Stack<String> actions;
	

	@Before
	public void setUp() throws Exception {
		actions = new LinkedListStack<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPushPop() throws StackEmptyException {
		actions.push("Create new File");
		actions.push("Write first word");
		actions.push("Write second word");
		System.out.println(actions);
		String lastAction = actions.pop();
		System.out.println(actions);
		assertEquals("Write second word", lastAction);
		lastAction = actions.pop();
		System.out.println(actions);
		assertEquals("Write first word", lastAction);
		lastAction = actions.pop();
		System.out.println(actions);
		assertEquals("Create new File", lastAction);
	}

}
