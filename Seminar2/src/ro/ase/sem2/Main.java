package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {

		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		CurrentAccount c1=new CurrentAccount(300,"IBAN2");
		System.out.println("Suma disponibila este: "+c.getBalance());
		System.out.println("Credit maxim pentru un cont curent este: "+CurrentAccount.MAX_CREDIT);
		c.Deposit(200);
		System.out.println("Suma dupa adaugare: "+c.getBalance());
		try {
			c.Withdraw(100);
			c.Transfer(100, c);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		System.out.println("Suma dupa retragere: "+c.getBalance());

		System.out.println("Suma cont 1: "+c.getBalance());
		System.out.println("Suma cont 2: "+c1.getBalance());
		
		
	}

}
