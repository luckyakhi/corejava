package in.javacomics.datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickerSorterTest {

	Sorter<Integer> quickSorter;
	
	@Before
	public void setUp() throws Exception {
		quickSorter = new QuickSorter<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		Integer[] inputArray = new Integer[]{4,8,2,9,13,54,67,11,3};
		quickSorter.sort(inputArray);
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
		
	}

}
