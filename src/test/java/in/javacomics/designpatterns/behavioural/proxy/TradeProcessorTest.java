package in.javacomics.designpatterns.behavioural.proxy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import in.javacomics.designpatterns.behavioural.visitor.Trade;


public class TradeProcessorTest {
	
	private TradeProcessor processor;
	
	@Mock
	private TradeRepo tradeRepo;
	@Mock
	private Enricher enricher;
	@Mock
	private Sender sender;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		processor = new TradeProcessor(tradeRepo, enricher, sender);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcess() {
		List<Trade> testTrades = buildTestTrades();
 		when(tradeRepo.getTrades()).thenReturn(testTrades);
		when(enricher.enrich(testTrades)).thenReturn(testTrades);
		processor.process();
		
		ArgumentCaptor<List> trades = ArgumentCaptor.forClass(List.class);
		verify(sender,atLeastOnce()).send(trades.capture());
		
		assertEquals(1, trades.getValue().size());
		
	}

	private List<Trade> buildTestTrades() {
		List<Trade> tradeList = new ArrayList<>();
		tradeList.add(new Trade(new Date(), "JPMSL", "SECURITY", "JPMCC"));
		return tradeList;
	}

}
