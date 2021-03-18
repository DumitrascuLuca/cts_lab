package ro.ase.sem2;

import ro.ase.sem2.interfata.NotificationSettings;

public class EmailNotificationService implements NotificationSettings{

	@Override
	public void sendNotification(String message) {
		System.out.println("Sent email notification with message: "+message);
		
	}
	

}
