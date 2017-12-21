package in.javacomics.datastructures;

public interface Sorter<E extends Comparable<E>> {
	public E[] sort(E[] inputList);
}
