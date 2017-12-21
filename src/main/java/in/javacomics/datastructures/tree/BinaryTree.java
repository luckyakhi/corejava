package in.javacomics.datastructures.tree;

import java.util.function.Consumer;

public interface BinaryTree<T>  {
	//Creational
	public BinaryTree<T> setRoot(Position<T> root);
	public void setLeftSubTree(BinaryTree<T> leftSubTree);
	public void setRightSubTree(BinaryTree<T> rightSubTree);
	
	//Accessor
	public Position<T> getRoot();
	public BinaryTree<T> getLeftSubTree();
	public BinaryTree<T> getLeftSubTree(Position<T> position);
	public BinaryTree<T> geRightSubTree(Position<T> position);
	public BinaryTree<T> geRightSubTree();
	public Position<T> getParent(Position<T> position);
	
	//Predicate
	public boolean isEmpty();
	
	//Traversals
	public void doPreOrderTraversal(Consumer<T> consumer);
	public void doInOrderTraversal(Consumer<T> consumer);
	public void doPostOrderTraversal(Consumer<T> consumer);
	void doBFSTraversal(Consumer<T> consumer);

}
