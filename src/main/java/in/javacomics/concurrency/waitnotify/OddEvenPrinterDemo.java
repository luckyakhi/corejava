package in.javacomics.concurrency.waitnotify;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenPrinterDemo {

	public static void main(String[] args) throws InterruptedException {
		OddEvenPrinter printer = new OddEvenPrinter();
		Runnable evenPrinter = () -> {
			while(true){
				printer.printNextEven();
			}
		};
		
		Runnable oddPrinter = () -> {
			while(true){
				printer.printNextOdd();
			}
		};
		
		ExecutorService evc = Executors.newCachedThreadPool();
		evc.submit(evenPrinter);
		evc.submit(oddPrinter);
		Thread.sleep(1000);
		evc.shutdown();
	}

}

class OddEvenPrinter {
	private int counter=1;
	public synchronized void  printNextEven() {
		try{
			if(counter%2!=0) wait();
			System.out.printf("%d,", counter++);
			notify();
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println("Interrupted exception occured");
		}
		
	}
	
	public synchronized void printNextOdd() {
		try{
			if(counter%2==0) wait();
			System.out.printf("%d,", counter++);
			notify();
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println("Interrupted exception occured");
		}
	}
}
