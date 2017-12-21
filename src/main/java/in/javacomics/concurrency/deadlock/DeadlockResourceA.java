package in.javacomics.concurrency.deadlock;

public class DeadlockResourceA  {
	private DeadlockResourceB deadLockResourceB;
	
	
	public DeadlockResourceA(DeadlockResourceB deadLockResourceB) {
		super();
		this.deadLockResourceB = deadLockResourceB;
	}

	public synchronized void call(){
		System.out.println(Thread.currentThread().getName()+":Inside A call");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		deadLockResourceB.last();
	}

	public synchronized void last() {
		System.out.println(Thread.currentThread().getName()+":Inside A last");
	}

}
