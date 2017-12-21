package in.javacomics.concurrency.producerconsumer;
public class ProducerTask implements Runnable {
	private java.util.concurrent.ArrayBlockingQueue<String> queue;
	private boolean interrupted;
	private int itemNumber;
	
	public ProducerTask(java.util.concurrent.ArrayBlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}


	@Override
	public void run() {
		while(!interrupted){
			try {
				queue.put("Item Number"+itemNumber);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}