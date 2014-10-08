package Java2_2;

public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void distance() {
		this.distance(new Point(0, 0));
	}

	public void distance(Point p2) {
		int absX = Math.abs(this.x-p2.x);
		int absY = Math.abs(this.y-p2.y);
		System.out.println(Math.sqrt(absX*absX+absY+absY));
	}

//	public double distance(Point p2) {
//		int absX = Math.abs(this.x-p2.x);
//		int absY = Math.abs(this.y-p2.y);
//		return Math.sqrt(absX*absX+absY+absY);
//	}
}
