package in.javacomics.concurrency.leftovers;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable{
	private CountDownLatch startSignal;
	private CountDownLatch endSignal;
	private int workerNumber;
	
	public Worker(CountDownLatch startSignal, CountDownLatch endSignal, int workerNumber) {
		super();
		this.startSignal = startSignal;
		this.endSignal = endSignal;
		this.workerNumber = workerNumber;
	}

	@Override
	public void run() {
		try {
			System.out.println("Woker:"+workerNumber+":Waiting for Start Signal");
			startSignal.await();
		} catch (InterruptedException e) {
			System.err.println("Woker:"+workerNumber+":Interrupted");
		}
		System.out.println("Woker:"+workerNumber+":Completed");
		endSignal.countDown();
		System.out.println("Woker:"+workerNumber+":End Signal Given");
	}

}
