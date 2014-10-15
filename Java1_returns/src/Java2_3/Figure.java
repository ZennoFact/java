package Java2_3;

public class Figure {
	String name;
	Point p1;
	Point p2;
	Point p3;
	
	public Figure() {
		// TODO Auto-generated constructor stub
	}
	
	public Figure(Point p1, Point p2, Point p3) {
		
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public void printArea() {
		System.out.println("printAreaメソッドは、サブクラスにおいて、その図形の面積を求めます。");
	}
	
	public void printExplain() {
		System.out.println("printExplainメソッドは、図形の説明を行うメソッドです。\n"
				+ "サブクラスにおいて、この図形の説明を行います。\n説明内容は、面積の求め方など、\n簡単な内容にとどめます。");
	}
}
