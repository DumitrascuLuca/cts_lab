package ro.ase.sem2;

import ro.ase.sem2.interfata.NotificationSettings;

public class SMSNotificationService implements NotificationSettings{
	
	public void sendNotification(String message) {
		System.out.println("Sent SMS notification with message: "+message);
	}

}
