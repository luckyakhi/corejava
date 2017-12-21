package in.javacomics.concurrency.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumerWaitNotifyDemo {

	public static void main(String[] args) {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>();
		QueueProducerTask producerTask = new QueueProducerTask(queue);
		QueueConsumerTask consumerTask = new QueueConsumerTask(queue);
		ExecutorService executorSvc = Executors.newFixedThreadPool(2);
		executorSvc.execute(producerTask);
		executorSvc.execute(consumerTask);
		executorSvc.shutdown();
		System.out.println("Main thread finished");
	}

}
