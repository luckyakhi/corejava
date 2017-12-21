package in.javacomics.datastructures.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BinarySearchTree<E extends Comparable<E>> implements Set<E> {
	
	private Node<E> root;
	private int numberOfElements;

	@Override
	public int size() {
		return numberOfElements;
	}

	@Override
	public boolean isEmpty() {
		return numberOfElements==0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(Object o) {
		if(root==null) return false;
		Comparable<? super E> comparableObj = (Comparable<? super E>) o;
		Node<E> currentNode = root;
		while(currentNode!=null){
			if(comparableObj.compareTo(currentNode.getValue())==0) return true;
			if(comparableObj.compareTo(currentNode.getValue())>0){
				currentNode = currentNode.getRightChild();
			}else{
				currentNode = currentNode.getLeftChild();
			}
		}
		
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		if(root==null) {
			root = new Node<E>(e, null, null, null);
			return true;
		}
		Node<E> parent = null;
		Node<E> currentNode = root;
		while(currentNode!=null){
			parent=currentNode;
			if(currentNode.getValue().compareTo(e)>0){
				currentNode = currentNode.getLeftChild();
			}else{
				currentNode = currentNode.getRightChild();
			}
		}
		if(parent.getValue().compareTo(e)>0){
			parent.leftChild=new Node<E>(e, parent, null, null);
		}else{
			parent.rightChild=new Node<E>(e, parent, null, null);
		} 
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	 final Node<E> getFirstEntry() {
		 	Node<E> p = root;
	        if (p != null)
	            while (p.leftChild != null)
	                p = p.leftChild;
	        return p;
	 
	 }
	private class BinarySearchTreeIterator<E> implements Iterator<E>{
		private Node<E> currentNode;
		
		private BinarySearchTreeIterator(Node<E> currentNode) {
			super();
			this.currentNode = currentNode;
		}

		@Override
		public boolean hasNext() {
			return currentNode!=null;
		}

		@Override
		public E next() {
			if(currentNode.leftChild!=null){
				Node<E> tempNode = currentNode.leftChild;
				while(tempNode.rightChild!=null){
					tempNode = tempNode.rightChild;
				}
				return tempNode.value;
					
			}
			
			return null;
		}
		
	}
	private class Node<E>{
		private E value;
		private Node<E> parent;
		private Node<E> leftChild;
		private Node<E> rightChild;
		private Node(E value, Node<E> parent, Node<E> leftChild,
				Node<E> rightChild) {
			super();
			this.value = value;
			this.parent = parent;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
		public E getValue() {
			return value;
		}
		public Node<E> getParent() {
			return parent;
		}
		public Node<E> getLeftChild() {
			return leftChild;
		}
		public Node<E> getRightChild() {
			return rightChild;
		}
		
	}

}
