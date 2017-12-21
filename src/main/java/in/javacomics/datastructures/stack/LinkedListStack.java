package in.javacomics.datastructures.stack;

public class LinkedListStack<E> implements Stack<E>{

	private Node<E> head;
	
	
	@Override
	public void push(E element) { 
		Node<E> temp = head;
		head = new Node<E>(element, temp);
	}
	
	@Override
	public E pop() throws StackEmptyException {
		if(head==null) return null;
		E returnVal = head.getElement();
		head = head.nextNode;
		return returnVal;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("LinkedListStack");
		Node<E> temp = head;
		while(temp!=null){
			sb.append("->");
			sb.append(temp.element.toString());
			temp = temp.nextNode;
		}
		sb.append("->null");
		return sb.toString();
	}



	private class Node<E>{
		private E element;
		private Node<E> nextNode;
		private Node(E element, Node<E> nextNode) {
			super();
			this.element = element;
			this.nextNode = nextNode;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNextNode() {
			return nextNode;
		}
		
		
	}
}
