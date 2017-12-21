package in.javacomics.concurrency;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutorService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.concurrency.leftovers.ThreadPoolManager;

public class ThreadPoolManagerTest {
	
	ExecutorService threadPoolManager;

	@Before
	public void setUp() throws Exception {
		threadPoolManager= new ThreadPoolManager();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

}
