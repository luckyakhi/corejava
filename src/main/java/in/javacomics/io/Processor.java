package in.javacomics.io;

import java.util.Queue;

public interface Processor<E> {
	public void process(Queue<E> source);
}
