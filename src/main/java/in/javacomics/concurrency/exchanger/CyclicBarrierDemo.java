package in.javacomics.concurrency.exchanger;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3);
		Task1 task1 = new Task1(cb);
		Task1 task2= new Task1(cb);
		ExecutorService svc = Executors.newFixedThreadPool(5);
		svc.submit(task1);
		svc.submit(task2);
		svc.shutdown();
		try {
			System.out.println("Main Thread is waiting on other Threads");
			cb.await();
			System.out.println("Main Thread barrier reached");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Task1 implements  Runnable {
	private CyclicBarrier cb;
	
	public Task1(CyclicBarrier cb) {
		super();
		this.cb = cb;
	}

	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Thread"+Thread.currentThread().getName()+" is waiting for barrier to complete");
			cb.await();
			System.out.println("Thread"+Thread.currentThread().getName()+" barrier reached");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}