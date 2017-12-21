package in.javacomics.designpatterns.behavioural.visitor;

import java.util.Date;

public class Trade implements Host{
	private Date tradeDate;
	private String trader;
	private String product;
	private String counterParty;
	
	private Date settlementDate;
	public Trade(Date tradeDate, String trader, String product, String counterParty) {
		super();
		this.tradeDate = tradeDate;
		this.trader = trader;
		this.product = product;
		this.counterParty = counterParty;
	}		
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}
	
	public Date getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}
	public void displayCounterparty(){
		System.out.println(this.counterParty);
	}
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}
	
	
}
