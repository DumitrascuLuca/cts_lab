package ro.ase.sem2;

public abstract class Account 
{
	//daca pui abstract ne forteaza ca in toate derivarile din clasa asta sa implementam deposit
	
	public abstract void Deposit(double amount);
	public abstract void Withdraw(double amount);
	public abstract void Transfer(double amount,Account destination);
	public abstract double getBalance();

}
