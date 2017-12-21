package in.javacomics.concurrency.leftovers;
public interface Queue<E> {
	public void offer(E element);
	public E poll();
}