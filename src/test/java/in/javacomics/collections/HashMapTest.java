package in.javacomics.collections;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.util.ReflectionUtils;


public class HashMapTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testClone() {
		HashMap<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("Key1", "Value1");
		stringMap.put("Key2", "Value2");
		HashMap<String,String> cloneOfMap = (HashMap<String, String>) stringMap.clone();
		assertEquals(cloneOfMap.get("Key1"), "Value1");
		assertEquals(cloneOfMap.get("Key2"), "Value2");
		//Shallow copy of key and values
	}

	@Test
	public void testSize() {
		HashMap<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("Key1", "Value1");
		stringMap.put("Key2", "Value2");
		assertEquals(2, stringMap.size());
	}


	@Test
	public void testContainsValue() {
		HashMap<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("Key1", "Value1");
		stringMap.put("Key2", "Value1");
		assertEquals(true, stringMap.containsValue( "Value1"));
	}

	@Test
	public void testContainsKey() {
		HashMap<String, String> labelValueHashMap = new HashMap<>();
		labelValueHashMap.put("Key1", "Value1");
		labelValueHashMap.put("Key2", "Value2");
		assertEquals(true, labelValueHashMap.containsKey("Key1"));
	}

	@Test
	public void testGet() {
		HashMap<String,String> labelValueMap = new HashMap<>();
		labelValueMap.put(null, "Select One");
		labelValueMap.put("IN", "India");
		labelValueMap.put("US", "United States Of America");
		labelValueMap.put("UK", "United Kingdom");
		assertEquals("Select One", labelValueMap.get(null));
		assertEquals("India",labelValueMap.get("IN"));
		assertEquals(null, labelValueMap.get("SRI"));
	}

	@Test
	public void testPut_DuplicateKey() {
		HashMap<String,String> labelValueMap = new HashMap<>();
		labelValueMap.put(null, "Select One");
		labelValueMap.put("IN", "India");
		String oldValue=labelValueMap.put("IN", "INDIA");
		assertEquals("INDIA", labelValueMap.get("IN"));
		assertEquals("India", oldValue);

	}
	
	//Treefiy threshold is 8 initial bucket size is 16 as capacity is 12 and load factor 0.75
	@Test
	public void testPut_More_Than_10_Nodes_On_One_Bucket_Gives_SingleTreeNode(){

		HashMap<KeyWithConstantHash, String> mapWithKeyCollisons = new HashMap<>();
		//Check initial tab array size
		Object[] tabArray = getTabArray(mapWithKeyCollisons);
		assertNull(tabArray);
		
		mapWithKeyCollisons.put(new KeyWithConstantHash("IN"), "India");
		//Check  tab array size after first insertion
		tabArray = getTabArray(mapWithKeyCollisons);
		assertEquals(16, tabArray.length);
		mapWithKeyCollisons.put(new KeyWithConstantHash("US"), "United States");
		mapWithKeyCollisons.put(new KeyWithConstantHash("UK"), "United Kingdom");
		mapWithKeyCollisons.put(new KeyWithConstantHash("AU"), "Australia");
		mapWithKeyCollisons.put(new KeyWithConstantHash("NZ"), "New Zealand");
		mapWithKeyCollisons.put(new KeyWithConstantHash("BR"), "Brazil");
		mapWithKeyCollisons.put(new KeyWithConstantHash("AG"), "Argentina");
		mapWithKeyCollisons.put(new KeyWithConstantHash("SA"), "South Africa");
		mapWithKeyCollisons.put(new KeyWithConstantHash("FR"), "France");
		//Check  tab array size after ninth insertion treeify threshold reached
		//but size less than MIN_TREEIFY_CAPACITY of 64 so size is doubled
		tabArray = getTabArray(mapWithKeyCollisons);
		assertEquals(32, tabArray.length);
		assertEquals(0, getCountOfTreeNodes(tabArray));
		mapWithKeyCollisons.put(new KeyWithConstantHash("DT"), "Germany");
		//Check  tab array size after tenth insertion treeify threshold breached 
		//but size less than MIN_TREEIFY_CAPACITY of 64 so size is doubled
		tabArray = getTabArray(mapWithKeyCollisons);
		assertEquals(64, tabArray.length);
		assertEquals(0, getCountOfTreeNodes(tabArray));
		mapWithKeyCollisons.put(new KeyWithConstantHash("IR"), "Ireland");
		//Check  tab array size after eleventh insertion treeify threshold breached also size reached MIN_TREEIFY_CAPACITY
		//so eleventh insertion triggered treeify operation
		tabArray = getTabArray(mapWithKeyCollisons);
		assertEquals(64, tabArray.length);
		assertEquals(1, getCountOfTreeNodes(tabArray));
		
	}
	
	@Test(expected=ConcurrentModificationException.class)
	public void testParallelIterationAndModification(){
		HashMap<String,String> countryMap = new HashMap<>();
		countryMap.put("IN", "India");
		countryMap.put("US", "United States");
		new Thread(){
			@Override
			public void run(){
				while(true){
					countryMap.put("BR", "Brazil");
				}
			}
		}.start();
			Set<Entry<String, String>> entrySet= countryMap.entrySet();
			Iterator<Entry<String, String>> iterator = entrySet.iterator();
			while(iterator.hasNext()){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(iterator.next());
			}
			
	}
	

	@Test
	public void testRemoveObject() {
		HashMap<String, String> keyValueMap = new HashMap<>();
		//Remove non existing object
		assertNull(keyValueMap.remove("NotPresent"));
		
		keyValueMap.put("Key1", "Value1");
		keyValueMap.put("Key2", "Value2");
		assertEquals("Value1", keyValueMap.remove("Key1"));
		assertNull(keyValueMap.remove("Key1"));
		
		//Removes null mapping
		keyValueMap.put("Key1", null);
		assertEquals(2, keyValueMap.size());
		assertNull(keyValueMap.remove("Key1"));
		assertEquals(1, keyValueMap.size());
		
		//Remove key value pair
		//Value wrong remove not successful
		assertFalse(keyValueMap.remove("Key2", "Value1"));
		assertEquals(1, keyValueMap.size());
	}

	@Test
	@Ignore("Trivial")
	public void testPutAll() {
		
	}

	@Test
	public void testClear() {
		HashMap<String, String> keyValueMap = new HashMap<>();
		keyValueMap.put("Key1", "Value1");
		keyValueMap.put("Key2", "Value2");
		keyValueMap.clear();
		assertEquals(0, keyValueMap.size());
	}

	@Test
	public void testKeySet() {
		HashMap<String,String> hashMap = new HashMap<>();
		//initially key set is null
		assertEquals(0,hashMap.keySet().size());
		//Prove that key set is a backed by the hashmap
		hashMap.put("Key1", "Value1");
		Set<String> keySet=hashMap.keySet();
		assertTrue(keySet.contains("Key1"));
		assertEquals("Value1",hashMap.remove("Key1"));
		assertFalse(keySet.contains("Key1"));
		
		
	}

	@Test
	@Ignore("Similar to KeySetTest")
	public void testValues() {
		
	}

	@Test
	public void testEntrySet() {
		HashMap<String,String> entryMap = new HashMap<>();
		entryMap.put("Key1", "Value1");
		entryMap.put("Key2", "Value2");
		entryMap.put("Key3", "Value3");
		Set<Entry<String,String>> entrySet = entryMap.entrySet();
		entrySet.stream().forEach(entry->assertTrue(entry.getKey().charAt(3)==entry.getValue().charAt(5)));
	}

	@Test
	public void testGetOrDefault() {
		HashMap<String,String> entryMap = new HashMap<>();
		entryMap.put("PresentKey", "PresentValue");
		assertEquals("Default", entryMap.getOrDefault("MissingKey", "Default"));
		assertEquals("PresentValue", entryMap.getOrDefault("PresentKey", "Default"));
	}

	@Test
	public void testPutIfAbsent() {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Key1", "Value1");
		assertEquals("Value1", hashMap.get("Key1"));
		assertEquals("Value1",hashMap.putIfAbsent("Key1", "Value2"));
		assertEquals("Value1", hashMap.get("Key1"));
	}

	@Test
	public void testReplaceKVV() {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Key1", "Value1");
		assertFalse(hashMap.replace("Key1", "Value2","Value3"));
		assertTrue(hashMap.replace("Key1", "Value1","Value2"));
		assertEquals("Value2", hashMap.get("Key1"));
	}

	@Test
	public void testReplaceKV() {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Key1", "Value1");
		assertEquals("Value1",hashMap.replace("Key1", "Value2"));
		assertEquals("Value2", hashMap.get("Key1"));
	}
	//private non test section -----------------------------------------------------
	private int getCountOfTreeNodes(Object[] tabArray) {
		int countOfTreeNode=0;
		for (Object object : tabArray) {
			if(object!=null && "java.util.HashMap$TreeNode".equals(object.getClass().getName())){
				countOfTreeNode++;
			}
		}
		return countOfTreeNode;
	}

	private Object[] getTabArray(HashMap<KeyWithConstantHash, String> mapWithKeyCollisons) {
		Field tableArray=ReflectionUtils.findField(HashMap.class, "table");
		ReflectionUtils.makeAccessible(tableArray);
		Object[] tabArray = (Object[]) ReflectionUtils.getField(tableArray, mapWithKeyCollisons);
		return tabArray;
	}
	
	class KeyWithConstantHash{
		private String key;
		public KeyWithConstantHash(String key) {
			super();
			this.key = key;
		}
		public String getKey() {
			return key;
		}

		@Override
		public int hashCode(){
			return 1;
		}
		@Override
		public boolean equals(Object o){
			if(this==o) return true;
			if(o instanceof KeyWithConstantHash){
				return (o==null?this==null:((KeyWithConstantHash)o).getKey().equals(this.getKey()));
			}
			return false;
		}
	}
	
	
}
