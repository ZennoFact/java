package animal;

public class Gnu extends Animal {

	public Gnu(String sex) {
		super(sex);
	}
	
	public void run(int addX, int addY) {
		this.x += addX * 3;
		this.y += addY * 3;
	}
}
