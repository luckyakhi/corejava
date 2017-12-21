package in.javacomics.datastructures;

public interface List<E> {
	public int size();
	public void addFirst(E element);
	public void addLast(E element);
	public void deleteFirst();
	public void deleteLast();
	public boolean isEmpty();
	public E first();
	public E last();
	public void prettyPrint();

}
