package in.javacomics.concurrency.leftovers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;

public class RunMultipleThreadsMultiple {

	public static void main(String[] args) {
		final int numberOfIteration = 5;
		final Phaser phaser = new Phaser(1){
			protected boolean onAdvance(int phase, int registeredParties) {
				System.out.println("----------------Phase:"+phase+"Completed------------------");
				return phase>=numberOfIteration || registeredParties==0;
			};
		};
		List<Runnable> taskList = getTaskList(4);
		for (Runnable runnable : taskList) {
			phaser.register();
			Thread t = new Thread(){
				public void run(){
					do{
						runnable.run();
						phaser.arriveAndAwaitAdvance();
					}while(!phaser.isTerminated());
					
				}
			};
			t.start();
		}
		phaser.arriveAndDeregister();
	}

	private static List<Runnable> getTaskList(int numberOfTasks) {
		List<Runnable> taskList = new ArrayList<>();
		for(int i=0;i<numberOfTasks;i++){
			final int taskNumber = i+1;
			taskList.add(()->System.out.println("Thread:"+Thread.currentThread().getName()+"Task:"+taskNumber+":running"));
		}
		return taskList;
	}

}
