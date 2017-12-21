package in.javacomics.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import in.javacomics.concurrency.producerconsumer.Consumer;
import in.javacomics.concurrency.producerconsumer.Producer;

public class ProducerConsumerDemoTest {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(5);
		Consumer consumer = new Consumer(blockingQueue);
		Producer producer = new Producer(blockingQueue);
		ExecutorService execSvc = Executors.newFixedThreadPool(2);
		Future<?> returnVal=execSvc.submit(producer);
		execSvc.execute(consumer);
		execSvc.awaitTermination(1, TimeUnit.MINUTES);
		execSvc.shutdownNow();
		System.out.println("Exiting Main");
	}
}
