package animal;

public class Sheep extends Animal {
	
	public Sheep(String sex) {
		super(sex);
	}
	
	public void run(int addX, int addY) {
		this.x += addX * 3;
		this.y += addY * 3;
	}
}
