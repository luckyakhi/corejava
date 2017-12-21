package in.javacomics.concurrency.semaphore;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class OddEvenPrinter {

	public static void main(String[] args) {
		Semaphore oddPermit = new Semaphore(1);
		Semaphore evenPermit = new Semaphore(0);
		OddPrinter oddPrinter = new OddPrinter(oddPermit, evenPermit);
		EvenPrinter evenPrinter = new EvenPrinter(evenPermit, oddPermit);
		ExecutorService executorSvc = Executors.newFixedThreadPool(2);
		executorSvc.execute(evenPrinter);
		executorSvc.execute(oddPrinter);
		try(Scanner scanner = new Scanner(System.in)){
			String nextLine = scanner.nextLine();
			if(nextLine.equalsIgnoreCase("x")){
				System.out.println("Shutting down threads now");
				executorSvc.shutdownNow();
			}
		}
		
	}

}
