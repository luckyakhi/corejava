package in.javacomics.builder;

import in.javacomics.abstraction.Flat;
import in.javacomics.builder.MultiAttributeFlat.Flatbuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlatBuilderTest {
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Flat flat = new Flatbuilder().balcony(true).carpetArea(787f).builtupArea(909f).
				floor(6).owner("Akhilesh Singh").build();
		System.out.println(flat);
	}

}
