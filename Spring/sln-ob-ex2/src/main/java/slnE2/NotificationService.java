package slnE2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	private User user;
	public NotificationService(User user) {
		this.user=user;
		System.out.println("Saludo Usuario");
	}
	
	public void greetUser(User user) {
		System.out.println("Saludos! "+this.user.getFullName()); 
	}
}
