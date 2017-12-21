package in.javacomics.concurrency.deadlock;

public class DeadlockResourceB {
	private DeadlockResourceA deadlockResourceA;
	
	

	public void setDeadlockResourceA(DeadlockResourceA deadlockResourceA) {
		this.deadlockResourceA = deadlockResourceA;
	}



	public synchronized void call() {
		System.out.println(Thread.currentThread().getName()+":Inside B call");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		deadlockResourceA.last();
		
	}



	public synchronized void last() {
		System.out.println(Thread.currentThread().getName()+":Inside B last");
	}

}
