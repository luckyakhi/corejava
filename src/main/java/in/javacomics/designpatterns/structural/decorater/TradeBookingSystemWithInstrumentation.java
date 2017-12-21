package in.javacomics.designpatterns.structural.decorater;

import in.javacomics.designpatterns.behavioural.visitor.Trade;

public class TradeBookingSystemWithInstrumentation implements TradeBookingSystem {
	
	private TradeBookingSystem tradeBookingSystem;
	
	
	public TradeBookingSystemWithInstrumentation(TradeBookingSystem tradeBookingSystem) {
		super();
		this.tradeBookingSystem = tradeBookingSystem;
	}



	@Override
	public void book(Trade t) {
		System.out.println("Start time:"+System.currentTimeMillis());
		tradeBookingSystem.book(t);
		System.out.println("End time:"+System.currentTimeMillis());
	}

}
