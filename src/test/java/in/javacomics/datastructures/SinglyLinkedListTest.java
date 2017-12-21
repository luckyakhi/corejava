package in.javacomics.datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.datastructures.List;
import in.javacomics.datastructures.list.SinglyLinkedList;

public class SinglyLinkedListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		
	}

	@Test
	public void testAddFirst() {
		List<String> cars = new SinglyLinkedList<>();
		cars.addFirst("Fiat Linea");
		cars.addFirst("Fiat Punto");
		cars.addFirst("Ford Ikon");
		cars.addFirst("Ford Fiesta");
		cars.addFirst("Maruti Desire");
		cars.prettyPrint();
		assertEquals(5, cars.size());
	}

	@Test
	public void testAddLast() {
		List<String> cars = new SinglyLinkedList<>();
		cars.addLast("Fiat Linea");
		cars.addLast("Fiat Punto");
		cars.addLast("Ford Ikon");
		cars.addLast("Ford Fiesta");
		cars.addLast("Maruti Desire");
		cars.prettyPrint();
		assertEquals(5, cars.size());
	}

	@Test
	public void testDeleteFirst() {
		List<String> cars = new SinglyLinkedList<>();
		cars.addLast("Fiat Linea");
		cars.addLast("Fiat Punto");
		cars.addLast("Ford Ikon");
		cars.addLast("Ford Fiesta");
		cars.addLast("Maruti Desire");
		cars.prettyPrint();
		assertEquals(5, cars.size());
		cars.deleteFirst();
		System.out.println("---------------After deleting -----------------------");
		cars.prettyPrint();
		assertEquals(4, cars.size());
		cars.deleteFirst();
		System.out.println("---------------After deleting -----------------------");
		cars.prettyPrint();
		assertEquals(3, cars.size());
		
	}

	@Test
	public void testDeleteLast() {
		List<String> cars = new SinglyLinkedList<>();
		cars.addLast("Fiat Linea");
		cars.addLast("Fiat Punto");
		cars.addLast("Ford Ikon");
		cars.addLast("Ford Fiesta");
		cars.addLast("Maruti Desire");
		cars.prettyPrint();
		assertEquals(5, cars.size());
		cars.deleteLast();
		System.out.println("---------------After deleting -----------------------");
		cars.prettyPrint();
		assertEquals(4, cars.size());
		cars.deleteLast();
		System.out.println("---------------After deleting -----------------------");
		cars.prettyPrint();
		assertEquals(3, cars.size());
		
	}

	@Test
	public void testIsEmpty() {
		
	}

	@Test
	public void testFirst() {
		
	}

	@Test
	public void testLast() {
		
	}

	@Test
	public void testPrettyPrint() {
		
	}

}
