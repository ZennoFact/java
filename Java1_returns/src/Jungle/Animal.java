package Jungle;

public class Animal {
	String sex;
	int age;
	int x;
	int y;
	
	public Animal(String sex) {
		this.sex = sex;
		this.age = 0;
	}
	
	public void move () {
		System.out.println("動物が動く");
	}
	
	
}
