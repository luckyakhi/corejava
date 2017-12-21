package in.javacomics.concurrency.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {

	public static void main(String[] args) throws InterruptedException {
		Phaser phaser = new Phaser();
		phaser.register();
		Thread t1 = new Thread(new PhaserTask(phaser));
		Thread t2 = new Thread(new PhaserTask(phaser));
		t1.start();
		t2.start();
		
		phaser.arriveAndAwaitAdvance();
		System.out.println("Main arrived");
		System.out.println("Number of registered parties" +phaser.getRegisteredParties());
		System.out.printf("Phase %s completed \n",phaser.getPhase());
		
		//Second phase
		Runnable guest1 = () -> {
			try {
				Thread.sleep(1000);
				System.out.println("Guest 1 Arrived");
				phaser.arrive();
				phaser.arrive();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		new Thread(guest1).start();
		Thread.sleep(1000);
		System.out.println("Main Arrived");
		phaser.arriveAndAwaitAdvance();
		System.out.println("Number of registered parties" +phaser.getRegisteredParties());
		System.out.printf("Phase %s completed \n",phaser.getPhase());
		
	}
	

}
class PhaserTask implements Runnable{
	private Phaser phaser;
	public PhaserTask(Phaser phaser) {
		super();
		this.phaser = phaser;
		phaser.register();
	}


	public void run() {
		System.out.println("Thread :"+Thread.currentThread().getName()+" Phaser arriving");
		phaser.arriveAndAwaitAdvance();
		System.out.println("Thread :"+Thread.currentThread().getName()+" Phaser arrived");
		
	}
	
}
