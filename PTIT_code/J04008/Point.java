package J04008;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point p1) {
		double r=Math.sqrt(Math.pow((p1.y-this.y),2)+(Math.pow((p1.x-this.x), 2)));
		return r;
	}
}