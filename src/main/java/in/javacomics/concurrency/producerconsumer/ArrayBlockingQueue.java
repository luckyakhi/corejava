package in.javacomics.concurrency.producerconsumer;

public class ArrayBlockingQueue<T> {
	private final static int DEFAULT_INITIAL_CAPCITY = 10;
	private T[] internalArray;
	private int currentIndex=-1;
	public ArrayBlockingQueue(int capacity) {
		super();
		internalArray = (T[])(new Object[capacity]);
	}
	public ArrayBlockingQueue(){
		internalArray = (T[])(new Object[DEFAULT_INITIAL_CAPCITY]);
	}
	
	public synchronized void add(T element){
		if(isFull()){
			try {
				System.out.println(Thread.currentThread().getName()+":----------waiting for queue to get free bucket-----------");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		internalArray[++currentIndex]=element;
		System.out.println(Thread.currentThread().getName()+":added element:"+element);
		notify();
	}
	
	public synchronized T remove(){
		if(isEmpty()){
			try {
				System.out.println(Thread.currentThread().getName()+":---------waiting for queue to get element-------------");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		T element = internalArray[currentIndex--];
		System.out.println(Thread.currentThread().getName()+":removed element:"+element);
		notify();
		return element;
	}
	private boolean isEmpty() {
		return (currentIndex == -1);
	}
	private boolean isFull() {
		return currentIndex==(internalArray.length-1);
	}
	
}
