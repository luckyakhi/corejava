package in.javacomics.staticdemo;

public class StaticOverrdingDemo {
	public static void main(String[] args) {
		TradeBookingSvc tradeBookingSvc = new SecureTradeBookingSvc();
		tradeBookingSvc.bookTrade();
	}
}
