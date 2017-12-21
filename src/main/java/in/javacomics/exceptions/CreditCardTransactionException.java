package in.javacomics.exceptions;

public class CreditCardTransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7768286673830708995L;
	
	public CreditCardTransactionException(String exceptionString,Throwable throwable){
		super(exceptionString, throwable);
	}

}
