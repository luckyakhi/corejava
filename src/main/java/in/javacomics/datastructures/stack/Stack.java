package in.javacomics.datastructures.stack;

public interface Stack<E> {
	public void push(E element);
	public E pop() throws StackEmptyException;
}
