package ro.ase.sem2;

public class Main {

	public static void main(String[] args) {

		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		System.out.println("Suma disponibila este: "+c.getBalance());
		System.out.println("Credit maxim pentru un cont curent este: "+CurrentAccount.MAX_CREDIT);
		c.Deposit(100);
		System.out.println("Suma dupa adaugare: "+c.getBalance());

	}

}
