package in.javacomics.datastructures;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.datastructures.list.DoublyLinkedList;

public class DoublyLinkedListTest {

	List<String> doublyLinkedList = null; 
	
	@Before
	public void setUp() throws Exception {
		doublyLinkedList = new DoublyLinkedList<String>();
	}

	@After
	public void tearDown() throws Exception {
		doublyLinkedList=null;
	}

	@Test
	public void test() {
		doublyLinkedList.add("Akhilesh");
		doublyLinkedList.add("Arnab");
		doublyLinkedList.add("Amit");
		doublyLinkedList.add("Ashutosh");
		System.out.println(doublyLinkedList);
		doublyLinkedList.remove("Arnab");
		System.out.println(doublyLinkedList);
		
	}

}
