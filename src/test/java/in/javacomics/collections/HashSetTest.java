package in.javacomics.collections;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class HashSetTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore("Deferred")
	public void testIterator() {
		
	}

	@Test
	public void testContains() {
		Set<String> set = new HashSet<>();
		set.add("Element 1");
		assertTrue(set.contains("Element 1"));
	}
	
	@Test
	public void testContainsDifferentType(){
		Set<String> setOfStrings = new HashSet<>();
		setOfStrings.add("First String");
		assertFalse(setOfStrings.contains(1));
	}
	
	@Test
	public void testContainsNull(){
		Set<String> set = new HashSet<>();
		assertFalse(set.contains(null));
		set.add(null);
		assertTrue(set.contains(null));
	}

	@Test
	public void testAdd_Duplicates() {
		Set<String> set = new HashSet<>();
		assertTrue(set.add("Element 1"));
		assertFalse(set.add("Element 1"));
		assertTrue(set.add(null));
		assertFalse(set.add(null));
	}
	
	@Test
	public void testAdd_Duplicates_Custom_Class_random_hashCode() {
		Set<Trade> set = new HashSet<>();
		assertTrue(set.add(new Trade("1")));
		assertTrue(set.add(new Trade("1")));
		assertEquals(2, set.size());
	}
	
	@Test
	public void testAdd_Duplicates_Proper_Class() {
		Set<TradeProper> set = new HashSet<>();
		assertTrue(set.add(new TradeProper("1")));
		assertFalse(set.add(new TradeProper("1")));
		assertEquals(1, set.size());
	}
	
	@Test
	public void testRemove() {
		Set<String> set = new HashSet<>();
		set.add("Element 1");
		assertTrue(set.remove("Element 1"));
		assertEquals(0, set.size());
		assertFalse(set.remove("Element 1"));
		assertFalse(set.remove(1));
	}

	@Test
	public void testCreateHashSetWithDuplicateElementsList() {
		List<String> duplicateElementList = new LinkedList<>();
		duplicateElementList.add("Element 1");
		duplicateElementList.add("Element 1");
		duplicateElementList.add("Element 1");
		duplicateElementList.add("Element 2");
		duplicateElementList.add("Element 2");
		duplicateElementList.add("Element 2");
		assertEquals(6, duplicateElementList.size());
		
		Set<String> set = new HashSet<>(duplicateElementList);
		assertEquals(2, set.size());
	}


	@Test
	@Ignore("Covered under linkedhashset")
	public void testHashSetIntFloatBoolean() {
		
	}

}

class Trade{
	private String tradeId;
	public Trade(String tradeId) {
		super();
		this.tradeId = tradeId;
	}
	public String getTradeId() {
		return tradeId;
	}
	public int hashcode(){
		return RandomUtils.nextInt();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trade other = (Trade) obj;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		return true;
	}
}

class TradeProper{
	private String tradeId;
	public TradeProper(String tradeId) {
		super();
		this.tradeId = tradeId;
	}
	public String getTradeId() {
		return tradeId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TradeProper other = (TradeProper) obj;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		return true;
	}
	
}
