package in.javacomics.datastructures;

public class TreeBuilder<E extends Comparable<E>> {
	public Tree<E> build(E[] preOrderTraversal,E[] inOrderTraversal){
		Tree<E> tree = null;
		if(preOrderTraversal.length>0){
			tree=new StandardTree<E>(preOrderTraversal[0]);
			E[] preorderLeftSubTree = getPreOrderLeftSubTree(inOrderTraversal,preOrderTraversal);
			E[] preorderRightSubTree = getPreOrderRightSubTree(inOrderTraversal,preOrderTraversal);
			E[] inorderLeftSubTree = getInOrderLeftSubTree(inOrderTraversal,preOrderTraversal);
			E[] inorderRightSubTree = geInOrderRightSubTree(inOrderTraversal,preOrderTraversal);
		}
		return null;
	}

	private E[] geInOrderRightSubTree(E[] inOrderTraversal,
			E[] preOrderTraversal) {
		// TODO Auto-generated method stub
		return null;
	}

	private E[] getInOrderLeftSubTree(E[] inOrderTraversal,
			E[] preOrderTraversal) {
		// TODO Auto-generated method stub
		return null;
	}

	private E[] getPreOrderRightSubTree(E[] inOrderTraversal,
			E[] preOrderTraversal) {
		// TODO Auto-generated method stub
		return null;
	}

	private E[] getPreOrderLeftSubTree(E[] inOrderTraversal,E[] preOrderTraversal) {
		// TODO Auto-generated method stub
		return null;
	}
}