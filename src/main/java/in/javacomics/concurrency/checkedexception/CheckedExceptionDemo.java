package in.javacomics.concurrency.checkedexception;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread checkedExceptionThrower = new Thread(()->{
			System.out.println(11/0);
		});
		checkedExceptionThrower.setUncaughtExceptionHandler((t,e) -> 
		System.out.printf("Exception thrown by thread t %s is %s",t.getName(),e.getMessage()));
		
		checkedExceptionThrower.start();
		checkedExceptionThrower.join();
		System.out.println("Main thread exiting");
		
	}

}
