package in.javacomics.datastructures.map;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedHashMapTest {
	
	private Map<String,String> linkedHashMap;

	@Before
	public void setUp() throws Exception {
		linkedHashMap = new LinkedHashMap<>();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_That_DuplicateKey_Overrides_And_Returns_Old_Value(){
		String oldKey=linkedHashMap.put("akhi.iitkgp@gmail.com", "Akhilesh");
		assertNull(oldKey);
		oldKey=linkedHashMap.put("akhi.iitkgp@gmail.com", "Singh");
		assertEquals("Akhilesh", oldKey);
		assertEquals("Singh", linkedHashMap.get("akhi.iitkgp@gmail.com"));
	}

	@Test
	public void testContainsValue() {
		linkedHashMap.put("akhi.iitkgp@gmail.com", "Akhilesh");
	}
	
	@Test
	public void testPut_Maintains_Insertion_Order(){
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Key1", "Value1");
		linkedHashMap.put("Key2", "Value2");
		linkedHashMap.put("Key3", "Value3");
		linkedHashMap.entrySet().stream().forEach(entry->System.out.println(entry));
		
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeySet() {
		fail("Not yet implemented");
	}

	@Test
	public void testValues() {
		fail("Not yet implemented");
	}

	@Test
	public void testEntrySet() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrDefault() {
		fail("Not yet implemented");
	}

	@Test
	public void testForEach() {
		fail("Not yet implemented");
	}

	@Test
	public void testReplaceAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testReplacementNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testNewTreeNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testReplacementTreeNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testReinitialize() {
		fail("Not yet implemented");
	}

	@Test
	public void testAfterNodeAccess() {
		fail("Not yet implemented");
	}

	@Test
	public void testAfterNodeInsertion() {
		fail("Not yet implemented");
	}

	@Test
	public void testAfterNodeRemoval() {
		fail("Not yet implemented");
	}

	@Test
	public void testInternalWriteEntries() {
		fail("Not yet implemented");
	}

	@Test
	public void testLinkedHashMapIntFloat() {
		fail("Not yet implemented");
	}

	@Test
	public void testLinkedHashMapInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testLinkedHashMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testLinkedHashMapMapOfQextendsKQextendsV() {
		fail("Not yet implemented");
	}

	@Test
	public void testLinkedHashMapIntFloatBoolean() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveEldestEntry() {
		fail("Not yet implemented");
	}

}
