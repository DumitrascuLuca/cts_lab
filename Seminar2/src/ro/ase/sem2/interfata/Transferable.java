package ro.ase.sem2.interfata;

import ro.ase.sem2.Account;
import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;

public interface Transferable {
	public  void Transfer(double amount,Depositable destination)  throws IllegalTransferException,InsufficientFundsException;

}
