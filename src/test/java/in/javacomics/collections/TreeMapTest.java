package in.javacomics.collections;

import static org.junit.Assert.*;

import java.util.TreeMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreeMapTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testPut_Natural_Sorted_Order() {
		TreeMap<String, String> countryMap = new TreeMap<>();
		countryMap.put("IN", "India");
		countryMap.put("US", "United States");
		countryMap.put("UK", "United Kingdom");
		countryMap.put("NZ", "New Zealand");
		countryMap.put("AU", "Australia");
		countryMap.entrySet().forEach(entry->System.out.println(entry));
	}
	
	@Test(expected=ClassCastException.class)
	public void testPut_Throws_ClassCastException_For_Not_Comparable() {
		TreeMap<Trade, String> tradeMap = new TreeMap<>();
		Trade equityTrade = new Trade("1","Equity");
		tradeMap.put(equityTrade, "equityTrade");
	}


	@Test
	public void testGet() {
		
	}

	@Test
	public void testTreeMapComparatorOfQsuperK() {
		
	}

	@Test
	public void testComparator() {
		
	}

	@Test
	public void testFirstKey() {
		
	}

	@Test
	public void testLastKey() {
		
	}

	@Test
	public void testFirstEntry() {
		
	}

	@Test
	public void testLastEntry() {
		
	}

	@Test
	public void testPollFirstEntry() {
		
	}

	@Test
	public void testPollLastEntry() {
		
	}

	@Test
	public void testLowerEntry() {
		
	}

	@Test
	public void testLowerKey() {
		
	}

	@Test
	public void testFloorEntry() {
		
	}

	@Test
	public void testFloorKey() {
		
	}

	@Test
	public void testCeilingEntry() {
		
	}

	@Test
	public void testCeilingKey() {
		
	}

	@Test
	public void testHigherEntry() {
		
	}

	@Test
	public void testHigherKey() {
		
	}

	@Test
	public void testNavigableKeySet() {
		
	}

	@Test
	public void testDescendingKeySet() {
		
	}

	@Test
	public void testDescendingMap() {
		
	}

	@Test
	public void testSubMapKBooleanKBoolean() {
		
	}

	@Test
	public void testHeadMapKBoolean() {
		
	}

	@Test
	public void testTailMapKBoolean() {
		
	}

	@Test
	public void testSubMapKK() {
		
	}

	@Test
	public void testHeadMapK() {
		
	}

	@Test
	public void testTailMapK() {
		
	}
	private class Trade{
		private String tradeId;
		private String instrumentType;
		public String getTradeId() {
			return tradeId;
		}
		public String getInstrumentType() {
			return instrumentType;
		}
		private Trade(String tradeId, String instrumentType) {
			super();
			this.tradeId = tradeId;
			this.instrumentType = instrumentType;
		}
		
		
	}

}
