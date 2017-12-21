package in.javacomics.concurrency.threadlocal;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class WithThreadLocal {

	public static void main(String[] args) throws InterruptedException {
		DatePrinterTask datePrinterTask = new DatePrinterTask();
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(datePrinterTask);
			t.start();
			TimeUnit.SECONDS.sleep(1);
		}
	}

	private static class DatePrinterTask implements Runnable {
		private static ThreadLocal<Date> d = new ThreadLocal<Date>() {
			protected Date initialValue() {
				return new Date();
			}
		};

		@Override
		public void run() {
			System.out.printf("Thread %s started at  %s \n", Thread.currentThread().getId(), d.get());
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("Thread %s ended  %s \n", Thread.currentThread().getId(), d.get());

		}

	}

}
