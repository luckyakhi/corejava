package in.javacomics.designpatterns.structural.decorater;

import in.javacomics.designpatterns.behavioural.visitor.Trade;

public class DefaultTradeBookingSystem implements TradeBookingSystem{

	@Override
	public void book(Trade t) {
		System.out.printf("Booked trade of with counterparty %s \n",t.getCounterParty());
		
	}

}
