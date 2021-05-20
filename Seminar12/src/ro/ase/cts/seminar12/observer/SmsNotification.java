package ro.ase.cts.seminar12.observer;

public class SmsNotification implements NotificationInterface{

	@Override
	public void notifyUser(double sum) {
		// TODO Auto-generated method stub
		System.out.println("SMS MESSAGE: "+sum+"extracted");
	}

}
