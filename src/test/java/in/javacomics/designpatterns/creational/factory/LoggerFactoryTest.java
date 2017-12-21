package in.javacomics.designpatterns.creational.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import in.javacomics.designpatterns.creational.singleton.Logger;

public class LoggerFactoryTest {
	
	@Autowired
	private LoggerFactory factory;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Logger logger = factory.createLogger();
		logger.log("Message");
	}

}
