package in.javacomics.anonymous;

public class AnonymousDemo {
	
	private static String classStaticVariable="oldValue";

	public static void main(String[] args) throws InterruptedException {
		String mainThreadVariable = "oldValue";
		//mainThreadVariable="newValue";
		Runnable task = new Runnable() {
			@Override
			public void run() {
				while(!Thread.currentThread().isInterrupted()){
					System.out.println("Main Thread:"+mainThreadVariable);
					System.out.println("AnonymousDemo:"+classStaticVariable);
				}
				System.out.println("Interrupted");
			}
		}; 
		Thread t1 = new Thread(task);
		t1.start();
		Thread.sleep(100);
		t1.interrupt();
	}

}
