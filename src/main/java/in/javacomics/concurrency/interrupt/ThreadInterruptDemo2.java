package in.javacomics.concurrency.interrupt;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ThreadInterruptDemo2 {
	public static void main(String[] args) {
		Runnable counterTask = ()-> {
			while(!Thread.interrupted()){
				System.out.printf("Thread %s running \n",Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					break;
				}
			}
			System.out.printf("Thread %s interrupted state: %s isAlive:%s \n",Thread.currentThread().getName(),Thread.currentThread().isInterrupted(),
					Thread.currentThread().isAlive());
		};
		
		Thread counterThread = new Thread(counterTask);
		counterThread.start();
		try(Scanner scanner = new Scanner(System.in)){
			while(true){
				String nextChar = scanner.next();
				if(nextChar.equalsIgnoreCase("x")){
					break;
				}
				System.out.println(nextChar);
			}
		}
		counterThread.interrupt();
		
	}
}
