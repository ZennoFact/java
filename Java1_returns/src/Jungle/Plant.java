package Jungle;

public class Plant {
	private final int x;
	private final int y;
	
	public Plant(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void absorbWater(String water) {
		System.out.println("植物は水を吸う");
		this.transpiration();
	}
	
	private void transpiration() {
		System.out.println("植物は蒸散も行う");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
