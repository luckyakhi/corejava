package in.javacomics.collections;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedHashSetTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIterationOrder() {
		Set<String> orderedSet = new LinkedHashSet<>();
		orderedSet.add("Element 1");
		orderedSet.add("Element 2");
		orderedSet.add("Element 3");
		orderedSet.add("Element 4");
		int i=1;
		for (String element : orderedSet) {
			assertEquals("Element "+i++, element);
		}

	}


}
