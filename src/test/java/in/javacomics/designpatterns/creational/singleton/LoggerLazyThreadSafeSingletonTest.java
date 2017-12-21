package in.javacomics.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoggerLazyThreadSafeSingletonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetInstance_with_multiple_threads() throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> LoggerLazyThreadSafeSingleton.getInstance());
		executorService.execute(() -> LoggerLazyThreadSafeSingleton.getInstance());
		executorService.shutdown();
		executorService.awaitTermination(2, TimeUnit.SECONDS);
		assertEquals(1, LoggerLazyThreadSafeSingleton.getInstanceCount());
		
	}

}
