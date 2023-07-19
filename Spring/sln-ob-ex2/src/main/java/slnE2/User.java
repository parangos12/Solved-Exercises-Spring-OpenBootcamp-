package slnE2;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String fullName;
	private Integer age;
	private String position;
	
	public User() {
	}
	
	public User(String fullName, Integer age, String position) {
		this.fullName = fullName;
		this.age = age;
		this.position = position;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
