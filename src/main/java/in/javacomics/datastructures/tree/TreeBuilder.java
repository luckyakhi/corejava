package in.javacomics.datastructures.tree;

import java.util.List;

public interface TreeBuilder<E> {
	public BinaryTree<E> generateBinaryTree(List<E> inOrderTraversal,List<E> preOrderTraversal);
}
