package in.javacomics.concurrency.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangerDemo {

	public static void main(String[] args) {
		Exchanger<StringBuilder> exchanger = new Exchanger<>();
		Runnable producerTask = () -> {
			try {
				StringBuilder sb = new StringBuilder();
				int i=0;
				while(sb.toString().length()<=10){
					char c = (char) ('a'+i++);
					System.out.printf("Appending  %c \n",c);
					sb.append(c);
				}
				System.out.println("Buffer full exchanging");
				sb=exchanger.exchange(sb);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable consumerTask = () -> {
			try {
				StringBuilder sb = new StringBuilder();
				sb=exchanger.exchange(sb);
				System.out.printf("String in Conumser is %s \n",sb);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		ExecutorService svc = Executors.newFixedThreadPool(2);
		svc.execute(producerTask);
		svc.execute(consumerTask);
		svc.shutdown();
	}

}
