package in.javacomics.datastructures;

import java.util.HashSet;
import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashCodeAndEqualsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		HashSet<AlwaysEqual> alwaysSingleHashset = new HashSet<>();
		for(int i=0;i<100;i++){
			alwaysSingleHashset.add(new AlwaysEqual());
		}
		Assert.assertTrue(alwaysSingleHashset.contains(new AlwaysEqual()));
	}
	
	private class AlwaysEqual{

		@Override
		public int hashCode() {
			return new Random(System.currentTimeMillis()).nextInt();
		}

		@Override
		public boolean equals(Object obj) {
			return true;
		}
		
	}
}
