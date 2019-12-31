package in.javacomics.exceptions;

public class CreditCardServerDownException extends RuntimeException {
    public CreditCardServerDownException(String message){
        super(message);
    }
}
