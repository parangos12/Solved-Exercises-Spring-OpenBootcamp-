package slnE2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		User user1=(User) context.getBean("user");
		user1.setFullName("Pedro Arango Sanchez");
		user1.setAge(23);
		user1.setPosition("System Engineer");
		
		UserService userService= (UserService) context.getBean("userService");
		userService.getNotificationUser().greetUser(user1);
	}
	
}
