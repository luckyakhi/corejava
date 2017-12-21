package in.javacomics.exceptions;

import java.math.BigDecimal;

public abstract class CreditCard {
	public abstract void  swipeAmount(float amount) throws CreditCardTransactionException;
	public abstract BigDecimal getUnbilledAmount();
}
