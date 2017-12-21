package in.javacomics.exceptions;

public class InsufficentBalanceException extends CreditCardTransactionException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6506988935012006070L;

	public InsufficentBalanceException(String exceptionString, Throwable throwable) {
		super(exceptionString, throwable);
	}

}
