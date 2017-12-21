package in.javacomics.designpatterns.behavioural.proxy;

import java.util.List;

import in.javacomics.designpatterns.behavioural.visitor.Trade;

public class TradeProcessor {
	
	private TradeRepo tradeRepo;
	private Enricher enricher;
	private Sender sender;
	
	public TradeProcessor(TradeRepo tradeRepo, Enricher enricher, Sender sender) {
		super();
		this.tradeRepo = tradeRepo;
		this.enricher = enricher;
		this.sender = sender;
	}
	
		public void process(){
			List<Trade> trades = tradeRepo.getTrades();
			trades = enricher.enrich(trades);
			sender.send(trades);
		}
}
