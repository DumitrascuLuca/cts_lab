package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;
import ro.ase.sem2.interfata.Depositable;
import ro.ase.sem2.interfata.Transferable;
import ro.ase.sem2.interfata.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable,Withdrawable{

	
	public void Deposit(double amount) throws InsufficientFundsException {
		if(amount>0){
		this.balance+=amount;
		}
	}


	public void Withdraw(double amount) throws InsufficientFundsException {
		if(amount>0){
		this.balance-=amount;
		}
		
	}

	
	/*public void Transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {

		throw new UnsupportedOperationException();
		
	}*/
	

}
