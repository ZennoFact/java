package Jungle;

public class Lion extends Animal {
	public final String species;
	
	public Lion(String sex) {
		super(sex);
		this.species = "ライオン";
	}

	@Override
	public void move() {
		System.out.println("ライオンが歩く");
	}
	
	public void run() {
		System.out.println("ライオンが走る");
	}
	
	public void eat(Animal animal) {
		System.out.println("ライオンはほかの動物を食べる");
	}
	
	public void sleep() {
		System.out.println("ライオンは眠る");
		this.toDream();
	}
	
	private void toDream() {
		System.out.println("ライオンは夢を見る");
	}
}
