package in.javacomics.collections;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BadKeyDemo {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_not_suitable_hashmap_key() {
		HashMap<BookingBadKey, String> badHashMap = new HashMap<BookingBadKey, String>();
		badHashMap.put(new BookingBadKey("1", "MUMBAI", "GLASGOW"), "value1");
		System.out.println(badHashMap.get(new BookingBadKey("1", "MUMBAI", "GLASGOW")));
	}

}
