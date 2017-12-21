package in.javacomics.datastructures;

import java.util.function.Consumer;

public interface Tree<E> {
	public E getRoot();
	public Tree<E> getLeftSubTree();
	public Tree<E> getRightSubTree();
	public void addElement(E e);
	public void doPreOrderTraversal(Consumer<E> c);
	public void doPostOrderTraversal(Consumer<E> c);
	public void doInOrderTraversal(Consumer<E> c);
	public void doBFSTraversal(Consumer<E> c);
}
