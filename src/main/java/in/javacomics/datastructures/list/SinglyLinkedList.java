package in.javacomics.datastructures.list;

import in.javacomics.datastructures.List;

public class SinglyLinkedList<E> implements List<E>{
	
	private Node<E> head = null;
	private int size;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(E element) {
		Node<E> temp = head;
		head=new Node<E>(element, temp);
		size++;
	}

	@Override
	public void addLast(E element) {
		Node<E> temp = head;
		if(temp==null){
			head=new Node<E>(element, temp);
		}else{
			while(temp.getNextElement()!=null){
				temp=temp.getNextElement();
			}
			Node<E> newNode = new Node<E>(element, null);
			temp.nextElement=newNode;
		}
		size++;
	}

	@Override
	public void deleteFirst() {
		Node<E> temp = head;
		if(temp==null) return;
		head = head.getNextElement();
		temp=null;
		size--;
	}

	@Override
	public void deleteLast() {
		Node<E> temp = head;
		if(temp==null) return;
		Node<E> nodeBeforeLast=null;
		while(temp.getNextElement()!=null){
			nodeBeforeLast=temp;
			temp= temp.getNextElement();
		}
		if(nodeBeforeLast!=null){
			nodeBeforeLast.nextElement=null;
		}
		temp=null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E last() {
		// TODO Auto-generated method stub
		return null;
	}
	private static class Node<E>{
		private E element;
		private Node<E> nextElement;
		public Node(E element, Node<E> nextElement) {
			super();
			this.element = element;
			this.nextElement = nextElement;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNextElement() {
			return nextElement;
		}
	}
	@Override
	public void prettyPrint() {
		Node<E> currentNode = head;
		while(currentNode!=null){
			System.out.println(currentNode.getElement());
			currentNode = currentNode.getNextElement();
		}
	}
}
