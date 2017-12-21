package in.javacomics.designpatterns.creational.singleton;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoggerLazySingletonTest {
	
	private static final String userDirectory = System.getProperty("user.dir")+"/target/test-classes";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetInstance_with_multiple_threads() throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(() -> LoggerLazySingleton.getInstance());
		executorService.execute(() -> LoggerLazySingleton.getInstance());
		executorService.shutdown();
		executorService.awaitTermination(2, TimeUnit.SECONDS);
		assertEquals(2, LoggerLazySingleton.getInstanceCount());
		
	}
	
	@Test
	public void break_singleton_by_serialization() throws FileNotFoundException, IOException, ClassNotFoundException{
		LoggerLazySingleton instance1 = LoggerLazySingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(userDirectory+"/logger.ser")));
		oos.writeObject(instance1);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(userDirectory+"/logger.ser")));
		LoggerLazySingleton instance2 = (LoggerLazySingleton) ois.readObject();
		assertFalse(instance1==instance2);

		
	}
	
	@Test
	public void fix_singleton_by_serialization_by_readresolve() throws FileNotFoundException, IOException, ClassNotFoundException{
		LoggerLazySingletonWithReadResolve instance1 = LoggerLazySingletonWithReadResolve.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(userDirectory+"/logger.ser")));
		oos.writeObject(instance1);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(userDirectory+"/logger.ser")));
		LoggerLazySingletonWithReadResolve instance2 = (LoggerLazySingletonWithReadResolve) ois.readObject();
		assertTrue(instance1==instance2);

		
	}

}
