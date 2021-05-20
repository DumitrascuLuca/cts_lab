package ro.ase.cts.seminar12.observer;


public abstract class Account 
{
	//daca pui abstract ne forteaza ca in toate derivarile din clasa asta sa implementam deposit
	
	
	
	public abstract double getBalance() throws InsufficientFundsException;
	public void addInterest(double interest) {
		// TODO Auto-generated method stub
		
	}
	

}
