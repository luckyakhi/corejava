package in.javacomics.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InsertionSorterTest {

	Sorter<String> insertionSorter;
	
	String[] inputArray;
	String[] outputArray;
	
	@Before
	public void setUp() throws Exception {
		insertionSorter = new InsertionSorter<String>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSort() {
		inputArray = new String[]{"Akhilesh","Amit","Arnab","Ashutosh"};
		outputArray=insertionSorter.sort(inputArray);
		for (String item : outputArray) {
			System.out.println(item);
		}
		
	}

}
