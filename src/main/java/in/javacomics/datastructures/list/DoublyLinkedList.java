package in.javacomics.datastructures.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoublyLinkedList<E> implements List<E>{
	
	transient private Node<E> first=null;
	transient private int size=0;
	
	
	
	public DoublyLinkedList() {
		first = new Node<E>(null, null, null);
	}

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
		if (first == null) return false;
		Node<E> currentNode = first;
		while(currentNode!=null){
			if(currentNode.equals(o)){
				return true;
			}
			currentNode = currentNode.nextNode;
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
		addAfter(first,e);
		return true;
	}

	private void addAfter(Node<E> node,E e) {
		Node<E> newNode = new Node<E>(node,node.previousNode, e);
		if(node.previousNode!=null)node.previousNode.nextNode=newNode;
		node.previousNode=newNode;
		node.nextNode=newNode.previousNode;
		size++;
	}

	@Override
	public boolean remove(Object o) {
		Node<E> currentNode = first.nextNode;
		while(currentNode!=null){
			if(currentNode.element!=null && currentNode.element.equals(o)){
				currentNode.previousNode.nextNode=currentNode.nextNode;
				currentNode.nextNode.previousNode = currentNode.previousNode;
				currentNode.nextNode=null;
				currentNode.element=null;
				currentNode.previousNode=null;
				currentNode = null;
				size--;
				return true;
			}
			currentNode = currentNode.previousNode;
		}
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
	public boolean addAll(int index, Collection<? extends E> c) {
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
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static class Node<E>{
		private Node<E> nextNode;
		private Node<E> previousNode;
		private E element;
		public Node(Node<E> nextNode,Node<E> previousNode, E element) {
			super();
			this.nextNode = nextNode;
			this.previousNode = previousNode;
			this.element = element;
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append('[');
        Node<E> currentNode = first;
        while(currentNode!=null){
        	sb.append(currentNode.element == this ? "(this Collection)" : currentNode.element);
            if (currentNode.previousNode!=null){
            	sb.append(',').append(' ');
        	}
            currentNode=currentNode.previousNode;
        }
        return sb.append(']').toString();
	}
	

}
