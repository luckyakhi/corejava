package in.javacomics.designpatterns.creational.builder;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TextFileLoadRequestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_create() {
		TextFileLoadRequest textFileLoadRequestBareMinimum = new TextFileLoadRequest("c:/tmp", "c:/tmp/target/", "Parquet");
		TextFileLoadRequest textFileLoadRequestWithEncoding = new 
				TextFileLoadRequest("c:/tmp", "c:/tmp/target/", "Parquet",Encoding.UTF_8);
		TextFileLoadRequest textFileLoadRequestWithEncodingAndDelimiter = new 
				TextFileLoadRequest("c:/tmp", ",","c:/tmp/target/", "Parquet",Encoding.UTF_8);
		
	}

}
