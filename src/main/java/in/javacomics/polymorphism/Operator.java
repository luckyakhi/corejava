package in.javacomics.polymorphism;

public interface Operator<T,V> {
	public T operate(T operand1,T operand2,V operation);
}
