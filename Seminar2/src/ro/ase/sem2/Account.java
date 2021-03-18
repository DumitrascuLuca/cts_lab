package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;

public abstract class Account 
{
	//daca pui abstract ne forteaza ca in toate derivarile din clasa asta sa implementam deposit
	
	
	
	public abstract double getBalance() throws InsufficientFundsException;
	public void addInterest(double interest) {
		// TODO Auto-generated method stub
		
	}
	

}
