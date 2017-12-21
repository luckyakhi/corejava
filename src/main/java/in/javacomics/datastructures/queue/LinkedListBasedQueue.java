package in.javacomics.datastructures.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedListBasedQueue<E> implements Queue<E>{
	private Node<E> headNode;
	private Node<E> tailNode;
	private int size;
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
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
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(E e) {
		Node<E> newNode = new Node<E>(e, null);
		if(tailNode==null){
			tailNode=newNode;
			headNode = newNode;
		}
		else{
			Node<E> tempNode = tailNode;
			tailNode=newNode;
			tempNode.next=newNode;
		}
		size++;
		return true;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		if(headNode!=null){
			Node<E> removedNode = headNode;
			headNode = headNode.next;
			size--;
			return removedNode.getValue();
		}
		
		return null;
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Linked List :");
		Node<E> tempNode = headNode;
		while(tempNode!=null){
			sb.append(tempNode.getValue()+"->");
			tempNode=tempNode.next;
		}
		sb.append("null");
		return sb.toString();
	}
	private class Node<E>{
		private E value;
		private Node<E> next;
		public E getValue() {
			return value;
		}
		public Node<E> getNext() {
			return next;
		}
		public Node(E value, Node<E> next) {
			super();
			this.value = value;
			this.next = next;
		}
		
		
	}
	
}
