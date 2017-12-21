package in.javacomics.concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("Barrier Reached"));
		Runnable task1 = () -> {
			try {
				System.out.println("Task 1 Running");
				Thread.sleep(1000);
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		};
		
		Runnable task2 = () -> {
			try {
				System.out.println("Task 2 Running");
				Thread.sleep(1000);
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		};
		
		Runnable task3 = () -> {
			try {
				System.out.println("Task 3 Running");
				Thread.sleep(1000);
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		};
		
		ExecutorService exeSvc = Executors.newFixedThreadPool(3);
		exeSvc.execute(task1);
		exeSvc.execute(task2);
		exeSvc.execute(task3);
		exeSvc.shutdown();
	}

}
