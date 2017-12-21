package in.javacomics.generics;

public class Pair {
	private Object firstElement;
	private Object secondElement;
	public Pair(Object firstElement, Object secondElement) {
		super();
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}
	public Object getFirstElement() {
		return firstElement;
	}
	public void setFirstElement(Object firstElement) {
		this.firstElement = firstElement;
	}
	public Object getSecondElement() {
		return secondElement;
	}
	public void setSecondElement(Object secondElement) {
		this.secondElement = secondElement;
	}
	
}
