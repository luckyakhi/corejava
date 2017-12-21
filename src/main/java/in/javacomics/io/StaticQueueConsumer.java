package in.javacomics.io;

import java.util.Queue;

public class StaticQueueConsumer implements Consumer<String> {
	private Queue<String> queue;
	
	public StaticQueueConsumer(Queue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void consume() {
		System.out.println("Consumed"+queue.element());
		
	}

}
