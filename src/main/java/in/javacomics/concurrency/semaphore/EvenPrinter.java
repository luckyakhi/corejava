package in.javacomics.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class EvenPrinter implements Runnable{
	private int currentEvenValue=2;
	private Semaphore startPermit;
	private Semaphore endPermit;

	public EvenPrinter(Semaphore startPermit, Semaphore endPermit) {
		super();
		this.startPermit = startPermit;
		this.endPermit = endPermit;
	}

	


	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()){
			try {
				startPermit.acquire();
				System.out.println(currentEvenValue);
				currentEvenValue+=2;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Even Thread interrupted at:"+currentEvenValue);
				System.out.println("Even thread status :"+Thread.currentThread().isInterrupted());
				break;
			}
			endPermit.release();
		}
		
	}

}
