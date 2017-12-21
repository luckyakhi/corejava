package in.javacomics.concurrency.leftovers;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable task = new Runnable() {
			
			public void run() {
				System.out.println("In Thread:"+Thread.currentThread().getName());
				
			}
		};
		
		Thread t1 = new Thread(task, "t1");
		System.out.println("In Thread:"+Thread.currentThread().getName());
		t1.start();
		t1.join();
		
		
	}

}
