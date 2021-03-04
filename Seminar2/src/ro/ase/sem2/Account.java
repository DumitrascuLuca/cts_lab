package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;

public abstract class Account 
{
	//daca pui abstract ne forteaza ca in toate derivarile din clasa asta sa implementam deposit
	
	public abstract void Deposit(double amount) throws InsufficientFundsException;
	public abstract void Withdraw(double amount) throws InsufficientFundsException;
	public abstract void Transfer(double amount,Account destination)  throws IllegalTransferException,InsufficientFundsException;
	public abstract double getBalance() throws InsufficientFundsException;

}
