package in.javacomics.designpatterns.creational.builder;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TextFileLoadRequestWithBuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_create() {
		TextFileLoadRequestWithBuilder request = TextFileLoadRequestWithBuilder.getBuilder().
				fileLocation("sourceLocation").targetLocation("targetLocation").build();
				
		assertEquals("targetLocation", request.getTargetLocation());
	}

}
