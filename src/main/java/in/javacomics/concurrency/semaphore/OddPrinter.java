package in.javacomics.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class OddPrinter implements Runnable{
	private int currentValue=1;
	private Semaphore startPermit;
	private Semaphore endPermit;

	public OddPrinter(Semaphore startPermit, Semaphore endPermit) {
		super();
		this.startPermit = startPermit;
		this.endPermit = endPermit;
	}
	


	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()){
			try {
				startPermit.acquire();
				System.out.println(currentValue);
				currentValue+=2;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Odd Thread interrupted at:"+currentValue);
				System.out.println("Odd thread status :"+Thread.currentThread().isInterrupted());
				break;
			}
			endPermit.release();
		}
		
	}

}
