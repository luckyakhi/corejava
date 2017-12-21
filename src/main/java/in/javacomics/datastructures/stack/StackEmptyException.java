package in.javacomics.datastructures.stack;

public class StackEmptyException extends Exception {
	private static final long serialVersionUID = 1074602346953039304L;

	public StackEmptyException(String message){
		super(message);
	}
}
