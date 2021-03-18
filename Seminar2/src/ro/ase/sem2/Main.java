package ro.ase.sem2;

import ro.ase.sem2.exceptii.IllegalTransferException;
import ro.ase.sem2.exceptii.InsufficientFundsException;
import ro.ase.sem2.interfata.NotificationSettings;

public class Main {

	public static void main(String[] args) {

		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		c.setNotificationService(new SMSNotificationService());
		CurrentAccount c1=new CurrentAccount(300,"IBAN2");
		
		
		
		System.out.println("Suma disponibila este: "+c.getBalance());
		SavingsAccount account3=new SavingsAccount(300,"IBAN3");
		System.out.println("Credit maxim pentru un cont curent este: "+CurrentAccount.MAX_CREDIT);
		c.Deposit(200);
		
		System.out.println("Suma dupa adaugare: "+c.getBalance());
		try {
			c.Withdraw(100);
			c.setNotificationService(new EmailNotificationService());
			c.Withdraw(200);
			c.setNotificationService(new NotificationSettings() {
				
				@Override
				public void sendNotification(String message) {
					System.out.println("sent push notification with message: "+message);
					
				}
			});
			c.Withdraw(120);
			c.Transfer(100, c);
			
		} catch (InsufficientFundsException | IllegalTransferException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
		System.out.println("Suma dupa retragere: "+c.getBalance());

		System.out.println("Suma cont 1: "+c.getBalance());
		System.out.println("Suma cont 2: "+c1.getBalance());
		
		account3.addInterest(10);
		
		System.out.println("suma in contul3 este: " + account3.getBalance());
		
		
		
		Bank banca = new Bank();
		BankAccount account4=banca.openBankAccount(1);
	}

}
