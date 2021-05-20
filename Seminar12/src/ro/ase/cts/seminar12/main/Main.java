package ro.ase.cts.seminar12.main;

import java.util.ArrayList;

import ro.ase.cts.seminar12.memento.CharacterMemento;
import ro.ase.cts.seminar12.memento.GameCharacter;
import ro.ase.cts.seminar12.observer.BankAccount;
import ro.ase.cts.seminar12.observer.CreditAccount;
import ro.ase.cts.seminar12.observer.InsufficientFundsException;
import ro.ase.cts.seminar12.observer.NotificationInterface;
import ro.ase.cts.seminar12.observer.SmsNotification;
import ro.ase.cts.seminar12.templeate.DecimalFormatter;
import ro.ase.cts.seminar12.templeate.HexFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditAccount account=new CreditAccount(1000,"IBAN RO201250");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double sum) {
				// TODO Auto-generated method stub
				System.out.println("Inline example: "+sum+" extracted");
			}
		});
		NotificationInterface notificationInterface=new SmsNotification();
		account.addObserver(notificationInterface);
		try {
			account.Withdraw(100);
			account.removeObserver(notificationInterface);
			account.Withdraw(100);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n---------------------------------------------");
		ArrayList<CharacterMemento> saveList=new ArrayList<CharacterMemento>();
		GameCharacter myCharacter=new GameCharacter("Gigelino", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("My character hitpoints: "+myCharacter.getHitpoints());
		myCharacter.setEmmento(saveList.get(0));
		System.out.println("My character hitpoints: "+myCharacter.getHitpoints());		
		
		System.out.println("\n---------------------------------------------");
		
		DecimalFormatter decimalFormatter=new DecimalFormatter();
		decimalFormatter.displayOutput(10);
		HexFormatter hexFormatter=new HexFormatter();
		hexFormatter.displayOutput(10);
	}

}
