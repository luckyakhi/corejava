package in.javacomics.concurrency.leftovers;

public class CapacityRestrictedBlockingQueue<E> implements Queue<E> {
	private static final int defaultSize = 10;
	private Object[] internalArray;
	private int size;
	private int index;
	
	
	public CapacityRestrictedBlockingQueue() {
		this(defaultSize);
	}

	
	public CapacityRestrictedBlockingQueue(int size) {
		super();
		this.size = size;
		internalArray=new Object[size];
	}


	@Override
	public void offer(E element)  {
		synchronized (this) {
			if(index==size-1){
				try {
					wait();
				} catch (InterruptedException e) {
					//TODO:Handle exception
				}
				internalArray[index++]=element;
				System.out.println("Elemet added"); 
				notify();
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public E poll() {
		synchronized (this) {
			if(index==-1){
				try {
					wait();
					return (E) internalArray[index--];
				} catch (InterruptedException e) {
					//TODO:Handle exception
				}
				finally{
					notify();
				}
				
				
			}
		}
		return null;
	}

}