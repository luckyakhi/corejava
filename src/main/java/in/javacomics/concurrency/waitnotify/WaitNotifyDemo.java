package in.javacomics.concurrency.waitnotify;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread acquires the intrinsic lock when it enters a synchronized method. 
 * Thread inside the synchronized method is set as the owner of the lock and is in RUNNABLE state. 
 * Any thread that attempts to enter the locked method becomes BLOCKED.
 * When thread calls wait it releases the current object lock (it keeps all locks from other objects) and than goes to WAITING state.
 * When some other thread calls notify or notifyAll on that same object the first thread changes state from WAITING to BLOCKED, 
 * Notified thread does NOT automatically reacquire the lock or become RUNNABLE, in fact it must fight for the lock with all other blocked threads.
 * WAITING and BLOCKED states both prevent thread from running, but they are very different.
 * WAITING threads must be explicitly transformed to BLOCKED threads by a notify from some other thread.
 * @author asi304
 *
 */
public class WaitNotifyDemo {

	public static void main(String[] args) {
		SharedResource sr = new SharedResource();
		Runnable producer = () -> {while(!Thread.interrupted()) sr.increment();};
		Runnable consumer = () -> {while(!Thread.interrupted())sr.decrement();};
		//Runnable reader = () -> {while(!Thread.interrupted())sr.getValue();};
		ExecutorService svc = Executors.newFixedThreadPool(2);
		svc.execute(producer);
		svc.execute(consumer);
		//svc.execute(reader);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		svc.shutdown();
	}

}

class SharedResource {
	private volatile boolean valueSet;
	private volatile int value;
	public synchronized void increment(){
		if(valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		value++;
		System.out.println("Set value:"+value);
		valueSet=true;
		notify();
		
	}
	public synchronized void decrement() {
		if(!valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet=false;
		value--;
		System.out.println("Get value:"+value);
		notify();
	}
	
	public synchronized void readValue() {
		if(!valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Read value:"+value);
		notify();
	}
}
