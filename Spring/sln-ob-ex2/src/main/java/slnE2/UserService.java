package slnE2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	private NotificationService notificationUser;	
	public UserService(NotificationService notificationUser) {
		this.notificationUser=notificationUser;
		System.out.println("Servicio de usuario ejecutandose");
	}
	
	public NotificationService getNotificationUser() {
		return notificationUser;
	}
	public void setNotificationUser(NotificationService notificationUser) {
		this.notificationUser = notificationUser;
	}
	

}
