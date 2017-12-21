package in.javacomics.datastructures.tree;

public interface Position<E> {
	public E getElment();
	public Position<E> getLeftChild();
	public Position<E> getRightChild();
	public Position<E> getParent();
	public void setLeftChild(Position<E> leftChild);
	public void setRightChild(Position<E> rightChild);
}
