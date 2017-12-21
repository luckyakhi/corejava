package in.javacomics.concurrency.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;

public class ConsumerTask implements Runnable {
	private java.util.concurrent.ArrayBlockingQueue<String> queue;
	private boolean interrupted;
	
	public ConsumerTask(ArrayBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while(!interrupted){
			try {
				queue.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}