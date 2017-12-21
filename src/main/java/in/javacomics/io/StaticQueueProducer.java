package in.javacomics.io;

import java.util.Queue;
import java.util.UUID;

public class StaticQueueProducer implements Producer<String>{
	
	private Queue<String> queue;
	
	public StaticQueueProducer(Queue<String> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void produce() {
		queue.add(UUID.randomUUID().toString());
		
	}

}
