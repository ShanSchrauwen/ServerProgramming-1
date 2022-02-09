package fi.haagahelia.course.domain;


public class Message {
	private int age;

	private String name;
	
	public long getAge() {
		return age;
	}
	public void setId(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Message [name=" + name + " age="+ age + "]";
	}
}
