package in.javacomics.datastructures.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class CircularArrayBasedQueue<E> implements Queue<E>{

	private static final int DEFAULT_CAPCITY = 10;
	private int capacity;
	private int frontIndex;
	private int rearIndex;
	private Object[] backingArray;
	
	
	public CircularArrayBasedQueue() {
		super();
		this.capacity = DEFAULT_CAPCITY;
		backingArray=new Object[capacity];
	}

	@Override
	public int size() {
		return Math.abs(frontIndex-rearIndex);
	}

	@Override
	public boolean isEmpty() {
		return frontIndex==rearIndex;
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
		if(size()==0) return false;
		frontIndex=Math.floorMod(frontIndex-1, capacity);
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
		if(isFull()) return false;
		backingArray[rearIndex]=e;
		rearIndex=Math.floorMod(rearIndex+1,capacity);
		
		
		return true;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		if(size()==0) return null;
		E element = (E) backingArray[frontIndex];
		frontIndex=Math.floorMod(frontIndex+1, capacity);
		return element;
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
	
	private boolean isFull() {
		return size()==(capacity-1);
	}


}
