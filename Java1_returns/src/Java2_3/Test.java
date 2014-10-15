package Java2_3;

public class Test {

	public static void main(String[] args) {
		Point point1 = new Point(5, 5);
		Point point2 = new Point(0, 0);
		Point point3 = new Point(9,1);
		point1.printCoodinates();
		point2.printCoodinates();
		point3.printCoodinates();
		
		Line line1 = new Line(point1, point2);
		Line line2 = new Line(point2, point3);
		Line line3 = new Line(point3, point1);
		line1.printDistance();
		line2.printDistance();
		line3.printDistance();
		
		Triangle tri1;
		if ( Triangle.isMakeTriangle(point1, point2, point3) ) {
			tri1 = new Triangle(point1, point2, point3);
			tri1.printArea();
		} else {
			System.out.println("その3点では三角形は作成できません");
		}
		
	}
}
