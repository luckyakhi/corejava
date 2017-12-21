package in.javacomics.io;

import java.util.List;
import java.util.Queue;

public interface Spliter<E> {
	public List<Queue<E>> split(Queue<E> source);
}
