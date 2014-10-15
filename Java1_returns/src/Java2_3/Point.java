package Java2_3;

public class Point {
	static int sirial = 0;
	String name;
	int x;
	int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.name = "point" + ++sirial;
		this.x = x;
		this.y = y;
	}
	
	public void printCoodinates() {
		System.out.println(this.getClass() +  ":" + name + "(" + x + ", " + y + ")");
	}
}
