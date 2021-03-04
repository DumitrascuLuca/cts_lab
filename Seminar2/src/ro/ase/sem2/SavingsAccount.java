package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount{
	
	public static double MIN_CREDIT=100;

	@Override
	public void Deposit(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		// TODO Auto-generated method stub
		
	}

}
