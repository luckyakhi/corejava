package in.javacomics.concurrency.deadlock;

public class DeadLockDemo {

	public static void main(String[] args) {
		DeadlockResourceB deadLockResourceB=new DeadlockResourceB();
		DeadlockResourceA deadlockResourceA = new DeadlockResourceA(deadLockResourceB);
		deadLockResourceB.setDeadlockResourceA(deadlockResourceA);
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				deadlockResourceA.call();
				
			}
		});
		t1.start();
		deadLockResourceB.call();
	}

}
