package animal;

public class Sheep extends Animal {
	
	public Sheep(String sex) {
		super(sex);
	}
	
	@Override
	public void move() {
		System.out.println("羊が歩く");
	}

	public void run() {
		System.out.println("羊が走る");
	}
}
