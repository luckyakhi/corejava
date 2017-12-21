package in.javacomics.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CopyOnArrayListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//Does not throw concurrent modification exception
	@Test
	public void testAddIntE_MultiThreaded() {
		List<String> concurrentArrayList  = new CopyOnWriteArrayList<>();
		Thread producer1 = new Thread(()->concurrentArrayList.add("Akhilesh"));
		Thread producer2 = new Thread(()->concurrentArrayList.add("Amit"));
		producer1.start();
		producer2.start();
		for (String string : concurrentArrayList) {
			System.out.println(string);
		}
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testIteratorRemove(){
		List<String> concurrentArrayList  = new CopyOnWriteArrayList<>();
		concurrentArrayList.add("Element 1");
		concurrentArrayList.add("Element 2");
		Iterator<String> iterator = concurrentArrayList.iterator();
		iterator.remove();
	}
	
	@Test
	@Ignore("Deferred")
	public void testRemoveInt() {
		
	}

	@Test
	@Ignore("Deferred")
	public void testRemoveObject() {
		
	}

	@Test
	public void testAddIfAbsent() {
		final CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		ExecutorService executorSvc = Executors.newCachedThreadPool();
		Future<Boolean> futureAdded = executorSvc.submit(()-> list.addIfAbsent("Akhilesh"));
		boolean addedInMainThread = list.addIfAbsent("Akhilesh");
		assertEquals(1, list.size());
		boolean addedInOtherThread = false;
		try {
			addedInOtherThread = futureAdded.get();
		} catch (InterruptedException | ExecutionException e) {
			assertFalse(true);
		}
		assertFalse(addedInMainThread && addedInOtherThread);
		executorSvc.shutdown();
	}

	@Test
	@Ignore("Deferred")
	public void testAddAllAbsent() {
		
	}

}
