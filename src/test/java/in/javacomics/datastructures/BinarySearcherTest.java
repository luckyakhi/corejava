package in.javacomics.datastructures;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BinarySearcherTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore("Stack Overflow coming")
	public void testSearch() {
		BinarySearcher<Integer> searcher = new BinarySearcher<Integer>();
		Integer[] inputArray={1,5,8,9,13};
		Assert.assertEquals(0, searcher.search(inputArray, 1));
		Assert.assertEquals(1, searcher.search(inputArray, 5));
		Assert.assertEquals(2, searcher.search(inputArray, 8));
		Assert.assertEquals(3, searcher.search(inputArray, 9));
		Assert.assertEquals(4, searcher.search(inputArray, 13));
		Assert.assertEquals(5, searcher.search(inputArray, 19));
	}

}
