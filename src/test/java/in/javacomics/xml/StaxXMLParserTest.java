package in.javacomics.xml;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StaxXMLParserTest {
	
	private StaxXMLParser parser;
	private String testDirectory;
	@Before
	public void setUp() throws Exception {
		parser = new StaxXMLParser();
		testDirectory=System.getProperty("user.dir")+"/target/test-classes/test-files";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParse() throws FileNotFoundException, Exception {
		parser.parse(new FileInputStream(new File(testDirectory+"/User.xml")));
	}

}
