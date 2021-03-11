package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;
import ro.ase.sem2.interfata.Profitable;

public class SavingsAccount extends BankAccount implements Profitable{

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void Deposit(double amount) {
		this.balance +=amount;
		
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance) {
			this.balance -=amount;
		}
		
	}

	@Override
	public void Transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)){
			throw new IllegalTransferException("conturile coincid");
		}
		else {
			this.Withdraw(amount);
			destination.Deposit(amount);
		}
		
	}

	@Override
	public void addInterest(double interest) {
		this.balance *=(1+ interest/100);
		
	}

}
