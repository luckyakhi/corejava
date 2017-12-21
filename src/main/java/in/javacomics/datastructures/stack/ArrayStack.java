package in.javacomics.datastructures.stack;

public class ArrayStack<E> implements Stack<E>{

	private static final int CAPACITY = 10;
	private int currentIndex = 0;
	private Object[] backingArray;
	
	public ArrayStack() {
		backingArray = new Object[CAPACITY];
	}

	@Override
	public void push(E element) {
		checkIfFull();
		backingArray[++currentIndex]=element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E pop() throws StackEmptyException {
		checkIfEmpty();
		return (E)backingArray[currentIndex--];
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		if(currentIndex==0) return "Empty";
		sb.append("[");
		for (Object object : backingArray) {
			if(object!=null) {
				sb.append(object);
				sb.append(',');
			}
		}
		return sb.substring(0, sb.length()-1)+"]";
		
	}
	
	private void checkIfFull() {
		if(currentIndex>=CAPACITY-1)
			throw new StackFullException("Stack is full");
	}

	

	private void checkIfEmpty() throws StackEmptyException {
		if(currentIndex==0) throw new StackEmptyException("Stack is empty");
	}

}
