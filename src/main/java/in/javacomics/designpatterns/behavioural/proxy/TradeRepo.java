package in.javacomics.designpatterns.behavioural.proxy;

import java.util.List;

import in.javacomics.designpatterns.behavioural.visitor.Trade;

public interface TradeRepo {
	List<Trade> getTrades();
}
