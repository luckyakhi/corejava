package in.javacomics.designpatterns.behavioural.visitor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import in.javacomics.designpatterns.behavioural.proxy.Enricher;
import in.javacomics.designpatterns.behavioural.proxy.Sender;
import in.javacomics.designpatterns.behavioural.proxy.TradeProcessor;
import in.javacomics.designpatterns.behavioural.proxy.TradeRepo;

public class TradeProcessorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void testProcess() {
		Sender sender=null;
		TradeRepo tradeRepo=null;
		Enricher enricher=null;
		TradeProcessor processor = new TradeProcessor(tradeRepo, enricher, sender);
		processor.process();
	}

}
