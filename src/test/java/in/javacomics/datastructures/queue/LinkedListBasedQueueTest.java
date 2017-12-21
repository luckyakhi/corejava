package in.javacomics.datastructures.queue;

import static org.junit.Assert.*;

import java.util.Queue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class LinkedListBasedQueueTest {
	
	private Queue<String> queue;

	@Before
	public void setUp() throws Exception {
		queue= new LinkedListBasedQueue<>();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testToProveThatAdditionIsDoneAtTail(){
		queue.add("Akhilesh");
		queue.add("Amit");
		String rearValue = getTailNodeValue();
		String frontValue = getHeadNodeValue();
		assertEquals(rearValue, "Amit");
		assertEquals(frontValue, "Akhilesh");
		System.out.println(queue);
	}
	
	@Test
	public void testToProveThatDeletionIsDoneAtHead(){
		queue.add("Akhilesh");
		queue.add("Amit");
		queue.add("Arnab");
		queue.add("Ashutosh");
		String headValue = getHeadNodeValue();
		assertEquals("Akhilesh", headValue);
		assertEquals(4, queue.size());
		System.out.println(queue);
		String removedValue=queue.remove();
		assertEquals("Akhilesh", removedValue);
		headValue = getHeadNodeValue();
		assertEquals("Amit", headValue);
		assertEquals(3, queue.size());
		System.out.println(queue);
	}

	private String getTailNodeValue() {
		Object tailNode=ReflectionTestUtils.getField(queue,"tailNode");
		String value = ReflectionTestUtils.invokeGetterMethod(tailNode, "value").toString();
		return value;
	}
	
	private String getHeadNodeValue() {
		Object tailNode=ReflectionTestUtils.getField(queue,"headNode");
		String value = ReflectionTestUtils.invokeGetterMethod(tailNode, "value").toString();
		return value;
	}

}
