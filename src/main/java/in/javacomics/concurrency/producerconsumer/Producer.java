package in.javacomics.concurrency.producerconsumer;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	private BlockingQueue<String> blockingQueue;
	
	
	
	public Producer(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}



	@Override
	public void run() {

		try {
			while(true){
				String elementToBeWritten = UUID.randomUUID().toString();
				blockingQueue.put(elementToBeWritten);
				System.out.println("Blocking Queue after putting:"+elementToBeWritten+"is:"+ blockingQueue);
				Thread.sleep(5000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
