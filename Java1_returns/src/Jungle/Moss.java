package Jungle;

public class Moss extends Plant {
	private final String species;

	public Moss(int x, int y) {
		super(x, y);
		this.species = "苔";
	}
	
	@Override
	public void absorbWater(String water) {
		// TODO Auto-generated method stub
		super.absorbWater(water);
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return super.getX();
	}
	
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return super.getY();
	}

	public String getSpecies() {
		return species;
	}
}
