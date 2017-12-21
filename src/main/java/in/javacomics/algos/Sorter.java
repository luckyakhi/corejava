package in.javacomics.algos;

import java.util.List;

public interface Sorter<T extends Comparable<T>> {
	public Iterable<T> sort(List<T> inputSequence);

}
