package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;
import ro.ase.sem2.interfata.Depositable;
import ro.ase.sem2.interfata.NotificationSettings;
import ro.ase.sem2.interfata.Transferable;
import ro.ase.sem2.interfata.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable,Transferable,Withdrawable{
	
	//majuscule= acest atribut este static
	//static=nu apartin unei instante ci apartin clasei in sine
	public static double MAX_CREDIT=5000;
	public NotificationSettings notificationService;
	

	//super se refera la instanta parintelui
	public CurrentAccount() {
		super();
		
	}

	
	
	
	public NotificationSettings getNotificationService() {
		return notificationService;
	}




	public void setNotificationService(NotificationSettings notificationService) {
		this.notificationService = notificationService;
	}




	//puteam sa avem un atribvut de sus maxcredit daca nu era static
	//folosim this pentru alte variabile
	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	//overload= mai multe functii cu nr de param diferit sau tipul pentru o metoda
	
	public void Deposit(double amount) {
		this.setBalance(getBalance()+amount);
		
	}

	
	public void Withdraw(double amount) throws InsufficientFundsException {
		if(this.getBalance()>=amount)
		{
		this.setBalance(getBalance()-amount);
		}
		else
		{

			throw new InsufficientFundsException("Fonduri insuficiente");

		}
		if(this.notificationService!=null)
		{
		this.notificationService.sendNotification("s-a extras suma de: "+amount+" lei");
		}
	}

	
	public void Transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException {
	if(((BankAccount)destination).iban.equals(this.iban))
	{
		throw new IllegalTransferException("conturile coincid");
	}
	else
	{
		this.Withdraw(amount);
		 destination.Deposit(amount);
		
	}
		
}

	
	

	
	

}
