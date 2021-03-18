package ro.ase.sem2.interfata;

import ro.ase.sem2.exceptii.InsufficientFundsException;

public interface Withdrawable {
	public abstract void Withdraw(double amount) throws InsufficientFundsException;
}
