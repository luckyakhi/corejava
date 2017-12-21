package in.javacomics.datastructures.map;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
	
	private Map<String, String> hashMap;

	@Before
	public void setUp() throws Exception {
		hashMap=new HashMap<>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPut() {
		hashMap.put("Akhilesh", "SoftwareDev");
		hashMap.put("Alan", "Lawyer");
		hashMap.put("House", "Doctor");
		assertEquals("SoftwareDev", hashMap.get("Akhilesh"));
		assertEquals("Lawyer", hashMap.get("Alan"));
		assertEquals("Doctor", hashMap.get("House"));
		assertNull(hashMap.get("Dexter"));
	}

}
