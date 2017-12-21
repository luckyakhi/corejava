package in.javacomics.datastructures.stack;

public class StackFullException extends RuntimeException {
	private static final long serialVersionUID = 4660184387946341528L;

		public StackFullException(String message){
			super(message);
		}
}
