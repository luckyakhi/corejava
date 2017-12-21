package in.javacomics.concurrency.daemon;

import java.util.concurrent.TimeUnit;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		Runnable daemonTask = () -> {
			while(true){
				System.out.println("Daemon thread is running");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread daemonThread = new Thread(daemonTask);
		daemonThread.setDaemon(true);
		daemonThread.start();
	}

}
