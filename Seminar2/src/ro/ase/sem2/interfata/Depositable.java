package ro.ase.sem2.interfata;

import ro.ase.sem2.exceptii.InsufficientFundsException;

public interface Depositable {
	public abstract void Deposit(double amount) throws InsufficientFundsException;
}
