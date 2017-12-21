package in.javacomics.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Spliterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		Collection<String> linkedList = new LinkedList<>();
		assertEquals(0, linkedList.size());
		
		linkedList.add("Amit");
		linkedList.add("Akhilesh");
		linkedList.add("Arnab");
		
		assertEquals(3, linkedList.size());
		//null allowed , duplicates allowed
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		assertEquals(6, linkedList.size());
	}

	@Test
	public void testContains() {
		Collection<String> linkedList = new LinkedList<>();
		linkedList.add("Akhilesh");
		assertTrue(linkedList.contains("Akhilesh"));
		
	}
	
	@Test
	public void testContains_With_Null(){
		Collection<String> linkedList = new LinkedList<>();
		linkedList.add(null);
		assertTrue(linkedList.contains(null));
	}
	
	@Test
	public void testContains_With_Different_Object(){
		Collection<String> linkedList = new LinkedList<>();
		linkedList.add("Akhilesh");
		assertFalse(linkedList.contains(1));
	}
	

	@Test
	public void testToArray() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Akhilesh");
		linkedList.add("Amit");
		linkedList.add("Arnab");
		linkedList.add("Ashutosh");
		Object[] arrayFromList = linkedList.toArray();
		assertEquals(4, arrayFromList.length);
		//Ordered List 
		for (int i = 0; i < arrayFromList.length; i++) {
			assertEquals(linkedList.get(i), arrayFromList[i]);
		}
		//Deep copy
		arrayFromList[3]="AshutoshModified";
		assertNotEquals(linkedList.get(3), arrayFromList[3]);
	}

	@Test
	public void testToArrayTArray() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Akhilesh");
		linkedList.add("Amit");
		linkedList.add("Arnab");
		linkedList.add("Ashutosh");
		String[] arrayFromList = linkedList.toArray(new String[]{});
		assertEquals(4, arrayFromList.length);
		//Ordered List 
		for (int i = 0; i < arrayFromList.length; i++) {
			assertEquals(linkedList.get(i), arrayFromList[i]);
		}
		//Deep copy
		arrayFromList[3]="AshutoshModified";
		assertNotEquals(linkedList.get(3), arrayFromList[3]);
	}

	@Test
	public void testAddE_Duplicates_Allowed() {
		LinkedList<String> linkedList = new LinkedList<>();
		assertTrue(linkedList.add("Akhilesh"));
		assertTrue(linkedList.add("Amit"));
		assertTrue(linkedList.add("Amit"));
		assertEquals(3, linkedList.size());
	
	}

	@Test
	public void testRemoveObject() {
		LinkedList<String> linkedList = new LinkedList<>();
		assertTrue(linkedList.add("Akhilesh"));
		assertTrue(linkedList.add("Amit"));
		assertTrue(linkedList.add("Amit"));
		
		assertTrue(linkedList.remove("Amit"));
		assertTrue(linkedList.remove("Amit"));
		assertFalse(linkedList.contains("Amit"));
		
	}

	@Test
	public void testAddAllCollectionOfQextendsE() {
		LinkedList<String> linkedList = new LinkedList<>();
		assertTrue(linkedList.add("Akhilesh"));
		assertTrue(linkedList.add("Amit"));
		assertTrue(linkedList.add("Amit"));
		assertTrue(linkedList.addAll(Arrays.asList(new String[]{"Arnab","Ashutosh","Ashutosh"})));
		assertEquals(6, linkedList.size());
	}

	@Test
	public void testClear() {
		LinkedList<String> linkedList = new LinkedList<>();
		assertTrue(linkedList.add("Akhilesh"));
		assertTrue(linkedList.add("Amit"));
		assertTrue(linkedList.add("Amit"));
		linkedList.clear();
		assertEquals(0, linkedList.size());
	}

	@Test
	public void testGet() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Akhilesh");
		assertEquals(linkedList.get(0), "Akhilesh");
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testGet_When_Index_not_present() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Akhilesh");
		linkedList.get(1);
	}

	@Test
	public void testSet() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Amit");
		String elementReturned=linkedList.set(0, "Akhilesh");
		assertEquals("Amit", elementReturned);
		assertEquals("Akhilesh", linkedList.get(0));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testSet_When_Index_Not_Present() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.set(0, "Akhilesh");
	}

	@Test
	public void testAddIntE() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Amit");
		linkedList.add(0,"Akhilesh");
		assertEquals("Amit", linkedList.get(1));
	
	}

	@Test
	public void testRemoveInt() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		String elementRemoved=linkedList.remove(1);
		assertEquals( "Akhilesh",elementRemoved);
		//Shifting of indexes
		assertEquals("Arnab", linkedList.get(1));
	}

	@Test
	public void testIndexOf() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		linkedList.add(3,"Amit");
		linkedList.add(4,"Akhilesh");
		linkedList.add(5,"Arnab");
		assertEquals(1, linkedList.indexOf("Akhilesh"));
	}

	@Test
	public void testLastIndexOf() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		linkedList.add(3,"Amit");
		linkedList.add(4,"Akhilesh");
		linkedList.add(5,"Arnab");
		assertEquals(4, linkedList.lastIndexOf("Akhilesh"));
	}

	@Test
	@Ignore("Deferred")
	public void testAddAllIntCollectionOfQextendsE() {
		
	}

	@Test
	public void testListIteratorInt() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		linkedList.add(3,"Amit");
		linkedList.add(4,"Akhilesh");
		linkedList.add(5,"Arnab");
		ListIterator<String> listIterator = linkedList.listIterator(1);
		int i=1;
		while(listIterator.hasNext()){
			assertEquals(linkedList.get(i++), listIterator.next());
		}
	}

	@Test
	public void testGetFirst() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		linkedList.add(3,"Amit");
		linkedList.add(4,"Akhilesh");
		linkedList.add(5,"Arnab");
		assertEquals("Amit", linkedList.getFirst());
		
	}

	@Test
	public void testGetLast() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		linkedList.add(3,"Amit");
		linkedList.add(4,"Akhilesh");
		linkedList.add(5,"Arnab");
		assertEquals("Arnab", linkedList.getLast());
	}

	@Test
	public void testRemoveFirst() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(0,"Amit");
		linkedList.add(1,"Akhilesh");
		linkedList.add(2,"Arnab");
		linkedList.add(3,"Amit");
		linkedList.add(4,"Akhilesh");
		linkedList.add(5,"Arnab");
		String removedElement = linkedList.removeFirst();
		assertEquals("Amit", removedElement);
		assertEquals("Akhilesh", linkedList.get(0));
	}

	@Test
	@Ignore("Deferred")
	public void testRemoveLast() {
		
	}

	@Test
	@Ignore("Deferred")
	public void testAddFirst() {
		
	}

	@Test
	@Ignore("Deferred")
	public void testAddLast() {
		
	}

	@Test
	public void testPeek() {
		Queue<String> queue = new LinkedList<>();
		queue.add("First Element");
		queue.add("Second Element");
		queue.add("Third Element");
		queue.add("Fourth Element");
		String firstElement = queue.peek();
		assertEquals("First Element", firstElement);
		//Element not removed
		assertEquals(4, queue.size());
	}
	
	@Test
	public void testPeek_When_Queue_is_Empty() {
		Queue<String> queue = new LinkedList<>();
		String firstElement = queue.peek();
		assertEquals(null, firstElement);
	}

	@Test
	public void testElement() {
		Queue<String> queue = new LinkedList<>();
		queue.add("First Element");
		queue.add("Second Element");
		queue.add("Third Element");
		queue.add("Fourth Element");
		String firstElement = queue.element();
		assertEquals("First Element", firstElement);
		//size not reduced
		assertEquals(4, queue.size());
		
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testElement_When_Queue_is_Empty() {
		Queue<String> queue = new LinkedList<>();
		queue.element();
		
	}

	@Test
	public void testPoll() {
		Queue<String> queue = new LinkedList<>();
		queue.add("First Element");
		queue.add("Second Element");
		queue.add("Third Element");
		queue.add("Fourth Element");
		String firstElement=queue.poll();
		assertEquals("First Element", firstElement);
		//size  reduced
		assertEquals(3, queue.size());
	}
	
	@Test
	public void testPoll_When_Queue_Is_Empty(){
		Queue<String> queue = new LinkedList<>();
		String element = queue.poll();
		assertEquals(null, element);
	}
	

	@Test
	public void testRemove() {
		Queue<String> queue = new LinkedList<>();
		queue.add("First Element");
		queue.add("Second Element");
		queue.add("Third Element");
		queue.add("Fourth Element");
		String firstElement=queue.remove();
		assertEquals("First Element", firstElement);
		//size  reduced
		assertEquals(3, queue.size());
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testRemove_When_Queue_Is_Empty() {
		Queue<String> queue = new LinkedList<>();
		queue.remove();
	}

	@Test
	public void testOffer() {
		Queue<String> queue = new LinkedList<>();
		queue.offer("First Element");
		queue.offer("Second Element");
		queue.offer("Third Element");
		queue.offer("Fourth Element");
		assertEquals(4, queue.size());
	}

	@Test
	@Ignore("Deferred")
	public void testOfferFirst() {
		
	}

	@Test
	@Ignore("Deferred")
	public void testOfferLast() {
		
	}

	@Test
	@Ignore("Deque")
	public void testPeekFirst() {
		
	}

	@Test
	@Ignore("Deque")
	public void testPeekLast() {
		
	}

	@Test
	@Ignore("Deque")
	public void testPollFirst() {
		
	}

	@Test
	@Ignore("Deque")
	public void testPollLast() {
		
	}

	@Test
	public void testPush() {
		Deque<String> stack = new LinkedList<>();
		stack.push("First Element");
		stack.push("Second Element");
		stack.push("Third Element");
		stack.push("Fourth Element");
		String lastElement = stack.pop();
		assertEquals("Fourth Element", lastElement);
		
	}

	@Test
	@Ignore("Covered in push test")
	public void testPop() {
		
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testPop_When_Queue_Empty(){
		Deque<String> stack = new LinkedList<>();
		stack.pop();
	}

	@Test
	public void testSpliterator_for_Each_remaining() {
		Deque<String> stack = new LinkedList<>();
		stack.push("First Element");
		stack.push("Second Element");
		stack.push("Third Element");
		stack.push("Fourth Element");
		Spliterator<String> spliterator = stack.spliterator();
		spliterator.forEachRemaining(s->System.out.println(s));
	}
	@Test
	@Ignore("Fork Join reading pending")
	public void testSpilterator_split(){
		Deque<String> stack = new LinkedList<>();
		stack.push("First Element");
		stack.push("Second Element");
		stack.push("Third Element");
		stack.push("Fourth Element");
		Spliterator<String> spliterator = stack.spliterator();
		Spliterator<String> spilteratorHalf=spliterator.trySplit();
		spilteratorHalf.forEachRemaining(s->System.out.println(s));
	}
	
	

}
