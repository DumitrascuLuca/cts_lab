package ro.ase.cts.seminar12.observer;



public interface Withdrawable {
	public abstract void Withdraw(double amount) throws InsufficientFundsException;
}
