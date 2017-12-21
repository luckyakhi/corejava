package in.javacomics.concurrency.producerconsumer;

import java.util.UUID;

public class QueueProducerTask implements Runnable{
	private ArrayBlockingQueue<String> queue;
	
	public QueueProducerTask(ArrayBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true){
			queue.add(UUID.randomUUID().toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
