package in.javacomics.datastructures.queue;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DoublyLinkedListBasedDeque<E> implements Deque<E>{
	private Node<E> head;
	private Node<E> tail;
	private class Node<E>{
		private E value;
		private Node<E> next;
		private Node<E> previous;
		private Node(E value,Node<E> next,
				Node<E> previous) {
			super();
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
		public E getValue() {
			return value;
		}
		public Node<E> getNext() {
			return next;
		}
		public Node<E> getPrevious() {
			return previous;
		}
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Linked List ->");
		if(head==null) return sb.toString();
		while(head!=null){
			sb.append(head.getValue());
			sb.append("->");
			head=head.next;
		}
		sb.append("null");
		return sb.toString();
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
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
	public void addFirst(E value) {
		Node<E> tempHead = head;
		Node<E> node= new Node<E>(value,tempHead, null);
		if(head==null){
			tail=node;
		}else{
			tempHead.previous=node;
		}
		head=node;
	}



	@Override
	public void addLast(E value) {
		Node<E> tempTail = tail;
		Node<E> node= new Node<E>(value,null, tempTail);
		if(tail==null){
			head=node;
		}else{
			tempTail.next=node;
		}
		tail=node;
	}



	@Override
	public boolean offerFirst(E e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean offerLast(E e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public E removeFirst() {
		if(head==null) return null;
		Node<E> removedElement = head;
		head=head.next;
		head.previous=null;
		return removedElement.value;
	}



	@Override
	public E removeLast() {
		if(tail==null) return null;
		Node<E> removedElement = tail;
		tail=tail.previous;
		tail.next=null;
		return removedElement.value;
	}



	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public E getFirst() {
		if(head==null) return null;
		return head.getValue();
	}



	@Override
	public E getLast() {
		if(tail==null) return null;
		return tail.getValue();
	}



	@Override
	public E peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public E peekLast() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public E remove() {
		// TODO Auto-generated method stub
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
	public void push(E e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
