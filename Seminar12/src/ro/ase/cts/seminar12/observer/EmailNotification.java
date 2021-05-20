package ro.ase.cts.seminar12.observer;

public class EmailNotification implements NotificationInterface{

	@Override
	public void notifyUser(double sum) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email notification to user, and sum: "+sum);
	}

}
