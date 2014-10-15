package Java2_3;

public class Line {
	static int sirial = 0;
	String name;
	Point pointStart;
	Point pointEnd;
	
	public Line(Point start, Point end) {
		this.name = "Line" + ++sirial;
		this.pointStart = start;
		this.pointEnd = end;
	}
	
	public void printDistance() {
		System.out.println(this.getClass() +  ":" + name +  " > length:" + getDistance());
	}
	
	public double getDistance() {
		int absX = Math.abs(pointEnd.x - pointStart.x);
		int absY = Math.abs(pointEnd.y - pointStart.y);
		return Math.sqrt(Math.pow(absX, 2) + Math.pow(absY, 2));
	}
}
