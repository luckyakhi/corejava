package in.javacomics.concurrency.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintJob implements Runnable{
	private Lock lock = new ReentrantLock();
	
	public void run(){
		try{
			System.out.printf("Thread %s is waiting to get print access\n",Thread.currentThread().getId());
			lock.lock();
			System.out.printf("Thread %s is printing the job \n",Thread.currentThread().getId());
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally{
			lock.unlock();
		}
	}

}
