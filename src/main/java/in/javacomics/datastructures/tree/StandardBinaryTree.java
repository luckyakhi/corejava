package in.javacomics.datastructures.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class StandardBinaryTree<E> implements BinaryTree<E>{
	
	private Position<E> rootNode;
	
	public StandardBinaryTree() {
	}

	private StandardBinaryTree(Position<E> root) {
		this.rootNode=root;
	}
	
	@Override
	public BinaryTree<E> setRoot(Position<E> root) {
		rootNode=root;
		return this;
	}


	@Override
	public void setLeftSubTree(BinaryTree<E> leftSubTree) {
		if(rootNode!=null){
			rootNode.setLeftChild(leftSubTree.getRoot());
		}
	}

	@Override
	public void setRightSubTree(BinaryTree<E> rightSubTree) {
		if(rootNode!=null){
			rootNode.setRightChild(rightSubTree.getRoot());
		}
		
	}

	@Override
	public BinaryTree<E> getLeftSubTree() {
		return new StandardBinaryTree<E>(rootNode.getLeftChild());
	}
	
	@Override
	public BinaryTree<E> getLeftSubTree(Position<E> position) {
		return null;
	}
	
	@Override
	public BinaryTree<E> geRightSubTree() {
		return new StandardBinaryTree<>(rootNode.getRightChild());
	}

	@Override
	public BinaryTree<E> geRightSubTree(Position<E> position) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Position<E> getParent(Position<E> position) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEmpty() {
		return rootNode==null;
	}



	@Override
	public Position<E> getRoot() {
		return rootNode;
	}

	
	@Override
	public void doPreOrderTraversal(Consumer<E> c) {
		doPreOrderTraversal(rootNode,c);
		
	}
	@Override
	public void doPostOrderTraversal(Consumer<E> c) {
		doPostOrderTraversal(rootNode,c);
		
	}

	@Override
	public void doInOrderTraversal(Consumer<E> c) {
		doInOrderTraversal(rootNode,c);
		
	}
	
	@Override
	public void doBFSTraversal(Consumer<E> c) {
		doBFSTraversal(rootNode,c);
		
	}
	
	private void doBFSTraversal(Position<E> rootNode,Consumer<E> c) {
		if(rootNode==null) return;
		Deque<Position<E>> queue = new LinkedList<Position<E>>();
		queue.addLast(rootNode);
		Position<E> currentNode =null;
		do{
			currentNode = queue.remove();
			if(currentNode.getLeftChild()!=null){
				queue.addLast(currentNode.getLeftChild());
			}
			if(currentNode.getRightChild()!=null){
				queue.addLast(currentNode.getRightChild());
			}
			c.accept(currentNode.getElment());
			
		}while(!queue.isEmpty());
		
	}



	private void doPreOrderTraversal(Position<E> rootNode,Consumer<E> c) {
		if(rootNode==null) return;
		c.accept(rootNode.getElment());
		if(rootNode.getLeftChild()!=null){
			doPreOrderTraversal(rootNode.getLeftChild(),c);
		}
		if(rootNode.getRightChild()!=null){
			doPreOrderTraversal(rootNode.getRightChild(),c);
		}
		
		
	}
	
	private void doPostOrderTraversal(Position<E> rootNode,Consumer<E> c) {
		if(rootNode==null) return;
		if(rootNode.getLeftChild()!=null){
			doPostOrderTraversal(rootNode.getLeftChild(),c);
		}
		if(rootNode.getRightChild()!=null){
			doPostOrderTraversal(rootNode.getRightChild(),c);
			
		}
		c.accept(rootNode.getElment());
		
	}
	private void doInOrderTraversal(Position<E> rootNode,Consumer<E> c) {
		if(rootNode==null) return;
		if(rootNode.getLeftChild()!=null){
			doInOrderTraversal(rootNode.getLeftChild(),c);
		}
		c.accept(rootNode.getElment());
		if(rootNode.getRightChild()!=null){
			doInOrderTraversal(rootNode.getRightChild(),c);
			
		}
		
		
	}
	
	
	public static class Node<E> implements Position<E>{
		private Position<E> parentNode;
		private Position<E> leftNode;
		private Position<E> rightNode;
		private E value;
		@Override
		public E getElment() {
			return value;
		}
		@Override
		public Position<E> getLeftChild() {
			return leftNode;
		}
		@Override
		public Position<E> getRightChild() {
			return rightNode;
		}
		@Override
		public Position<E> getParent() {
			return parentNode;
		}
		@Override
		public void setLeftChild(Position<E> leftChild) {
			this.leftNode=leftChild;
			
		}
		@Override
		public void setRightChild(Position<E> rightChild) {
			this.rightNode=rightChild;
			
		}
		public Node(Position<E> parentNode, Position<E> leftNode, Position<E> rightNode, E value) {
			super();
			this.parentNode = parentNode;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
			this.value = value;
		}
		
		
		
	}


	
	

}
