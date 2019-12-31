package in.javacomics.exceptions;

import java.math.BigDecimal;

public class PredatoryCreditCard extends CreditCard{

	@Override
	public void swipeAmount(float amount) throws CreditCardTransactionException {
		// TODO Auto-generated method stub
		
	}

	//Runtime exception can be thrown in an overloaded method
	@Override
	public BigDecimal getUnbilledAmount() throws CreditCardServerDownException {
		//TODO implementation pending
		return null;
	}

	/* Not allowed @Override
	public void swipeAmount(float amount) throws Exception {
		// TODO Auto-generated method stub
		
	}*/
	

}
