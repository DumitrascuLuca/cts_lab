package ro.ase.cts.seminar12.observer;



public interface Depositable {
	public abstract void Deposit(double amount) throws InsufficientFundsException;
}
