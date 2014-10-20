package animal;

public class Gnu extends Animal {

	public Gnu(String sex) {
		super(sex);
	}
	
	@Override
	public void move() {
		System.out.println("ヌーが歩く");
	}

	public void run() {
		System.out.println("ヌーが走る");
	}
}
