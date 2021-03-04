package ro.ase.sem2;

public abstract class BankAccount extends Account
{
	//nu e obligatoriu sa avem o definitie deoarece e abstracta
	//daca nu specificam private sau protected atributul va fi vizibil la nivel de package 
	private double balance;
	protected String iban;//id
	
	//this are o referinta catre obiectul curent
	 public BankAccount() {
		this.balance=0;
		this.iban="-";
	}
	 
	 public BankAccount(double balance,String iban)
	 {
		 this.balance=balance;
		 this.iban=iban;
	 }
	
	//override in mostenire presupune definirea unei alte functionalitati decat in cea parinte
	@Override
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	


}
