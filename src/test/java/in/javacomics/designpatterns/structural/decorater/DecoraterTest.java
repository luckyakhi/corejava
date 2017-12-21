package in.javacomics.designpatterns.structural.decorater;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.designpatterns.behavioural.visitor.Trade;

public class DecoraterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		TradeBookingSystem tradeBookingSystem = new DefaultTradeBookingSystem();
		tradeBookingSystem.book(new Trade(new Date(), "Nomura", "DEBT", "RBS"));
		
		TradeBookingSystem tradeBookingSystemWithInstrumentation = new TradeBookingSystemWithInstrumentation(tradeBookingSystem);
		tradeBookingSystemWithInstrumentation.book(new Trade(new Date(), "Nomura", "DEBT", "RBS"));
	
	}

}
