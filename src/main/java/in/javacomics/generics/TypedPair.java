package in.javacomics.generics;

public class TypedPair<T extends Comparable<T>,V> {
	private T firstElement;
	private V secondElement;
	public TypedPair(T firstElement, V secondElement) {
		super();
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}
	public T getFirstElement() {
		return firstElement;
	}
	public void setFirstElement(T firstElement) {
		this.firstElement = firstElement;
	}
	public V getSecondElement() {
		return secondElement;
	}
	public void setSecondElement(V secondElement) {
		this.secondElement = secondElement;
	}
	
}
