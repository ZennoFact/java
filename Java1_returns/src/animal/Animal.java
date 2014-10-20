package animal;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Animal {
	String sex;
	int age;
	int x;
	int y;
	
	public Animal(String sex) {
		this.sex = sex;
		this.age = 0;
	}
	
	public void move (int addX, int addY) {
		this.x += addX;
		this.y += addY;
	}
}
