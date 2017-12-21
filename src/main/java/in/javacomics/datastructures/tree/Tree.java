package in.javacomics.datastructures.tree;

public interface Tree<T> extends Iterable<T>{
	public Position<T> root();
	public Iterable<Position<T>> positions();
	public Iterable<Position<T>> children(Position<T> p);
	public Position<T> parent(Position<T> p);
	public boolean isRoot(Position<T> position);
	public int size();
}
