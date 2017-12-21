package in.javacomics.concurrency.lock;

public class PrintJobWithLockDemo {

	public static void main(String[] args) {
		PrintJob printJob = new PrintJob();
		for(int i=0;i<5;i++){
			 new Thread(printJob).start();
		}
		System.out.println("Main terminated");
	}

}
