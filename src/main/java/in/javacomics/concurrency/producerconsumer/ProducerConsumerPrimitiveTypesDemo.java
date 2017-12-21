package in.javacomics.concurrency.producerconsumer;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducerConsumerPrimitiveTypesDemo {
	private static final Logger logger = LoggerFactory.getLogger(ProducerConsumerPrimitiveTypesDemo.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		SharedResource sharedResource = new SharedResource();
		Thread producerThread = new Thread(new IntegerProducer(sharedResource ));
		Thread consumerThread = new Thread(new IntegerConsumer(sharedResource));
		producerThread.start();
		consumerThread.start();
		try {
			producerThread.join();
		} catch (InterruptedException e) {
			System.out.println("Producer thread interupted");
		}
		try {
			consumerThread.join();
		} catch (InterruptedException e) {
			System.out.println("Consumer thread interupted");
		}
		
	}

}
class SharedResource {
	private int sharedInt;
	private volatile boolean modified;
	public synchronized  void   increment(){
		if(modified){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("producer flow interrupted");
			}
		}
		modified=true;
		sharedInt++;
		System.out.println(String.format("Producer Shared int %d",sharedInt));
		notify();
	}
	public synchronized void logIntValue() {
		if(!modified){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("consumer flow interrupted");
			}
		}
		modified=false;
		System.out.println(String.format("Consumer Shared int %d",sharedInt));
		notify();
	}
	public boolean isModified() {
		return modified;
	}
	
} 

class IntegerProducer implements Runnable{
	private SharedResource sharedResource;
	private static final Logger logger = LoggerFactory.getLogger(IntegerProducer.class);
	
	@Override
	public  void run() {
		try {
			while(true){
				Thread.sleep(1000);
				sharedResource.increment();
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public IntegerProducer(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}
	
}
class IntegerConsumer implements Runnable{
	private SharedResource sharedResource;
	private static final Logger logger = LoggerFactory.getLogger(IntegerConsumer.class);
	
	@Override
	public  void run() {
		try {
			while(true){
				Thread.sleep(2000);
				sharedResource.logIntValue();
			}
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public IntegerConsumer(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}

	
}
