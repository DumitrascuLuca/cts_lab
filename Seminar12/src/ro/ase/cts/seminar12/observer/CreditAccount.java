package ro.ase.cts.seminar12.observer;



public class CreditAccount extends BankAccount implements Depositable,Withdrawable{

	
	public CreditAccount(double balance,String iban) {
		super(balance,iban);
	}
	//entitate Observabil COncret
	
	@Override
	public void Deposit(double amount) throws InsufficientFundsException {
		if(amount>0){
		this.balance+=amount;
		}
	}

	@Override
	public void Withdraw(double amount) throws InsufficientFundsException {
		//metoda care are reolul de a notifica observator
		if(amount>0){
		this.balance-=amount;
		}
		for(NotificationInterface observer: this.observers) {
			observer.notifyUser(amount);
		}
		
	}

	
	/*public void Transfer(double amount, Depositable destination)
			throws IllegalTransferException, InsufficientFundsException {

		throw new UnsupportedOperationException();
		
	}*/
	

}
