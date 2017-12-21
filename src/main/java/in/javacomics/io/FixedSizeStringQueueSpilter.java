package in.javacomics.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class FixedSizeStringQueueSpilter<E> implements Spliter<E> {
	private int chunkSize;
	
	public FixedSizeStringQueueSpilter(int chunkSize) {
		super();
		this.chunkSize = chunkSize;
	}


	@Override
	public List<Queue<E>> split(Queue<E> source) {
		List<Queue<E>> queueList = new ArrayList<Queue<E>>();
		for(int i=0;i<chunkSize;i++){
			queueList.add(source);
		}
		return queueList;
	}

}
