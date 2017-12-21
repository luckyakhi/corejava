package in.javacomics.concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue<String> blockingQueue;
	
	
	
	public Consumer(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}



	@Override
	public void run() {

		try {
			while(true){
				System.out.println("Blocking Queue after reading:"+blockingQueue.take()+"is:"+ blockingQueue);
				Thread.sleep(10000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
