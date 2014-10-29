package Jungle;

public class Sheep extends Animal {
	private final String species;
	
	public Sheep(String sex) {
		super(sex);
		this.species = "羊";
	}
	
	@Override
	public void move() {
		System.out.println("羊が歩く");
	}

	public void run() {
		System.out.println("羊が走る");
	}
	
	public void eat (Plant plant) {
		System.out.println("羊は草を食べます");
	}

	public String getSpecies() {
		return species;
	}
}
