package in.javacomics.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

import in.javacomics.concurrency.leftovers.Worker;

public class CountdownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch endSignal = new CountDownLatch(3);
		CountDownLatch startSignal = new CountDownLatch(1);
		Worker worker1 = new Worker(startSignal, endSignal, 1);
		Worker worker2 = new Worker(startSignal, endSignal, 2);
		Worker worker3 = new Worker(startSignal, endSignal, 3);
		Thread t1 = new Thread(worker1);
		Thread t2 = new Thread(worker2);
		Thread t3 = new Thread(worker3);
		t1.start();
		t2.start();
		t3.start();
		startSignal.countDown();
		System.out.println("Main thread gave start signal");
		try {
			System.out.println("Main thread waiting");
			endSignal.await();
		} catch (InterruptedException e) {
			System.err.println("Main thread interrupted");
		}
		System.out.println("Main thread completed");
	}

}
