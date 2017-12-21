package in.javacomics.concurrency.producerconsumer;

public class QueueConsumerTask implements Runnable{
	private ArrayBlockingQueue<String> queue;
	

	public QueueConsumerTask(ArrayBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true){
			queue.remove();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
