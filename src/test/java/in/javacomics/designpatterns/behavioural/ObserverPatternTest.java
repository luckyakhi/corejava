package in.javacomics.designpatterns.behavioural;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ObserverPatternTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Observer observer1 = new ObserverLogger();
		Observer observer2 = new ObserverLogger();
		Observer observer3 = new ObserverLogger();
		CounterSubject subject = new CounterSubject();
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.registerObserver(observer3);
		subject.increment();
		subject.deregisterObserver(observer1);
		subject.increment();
	}

}
