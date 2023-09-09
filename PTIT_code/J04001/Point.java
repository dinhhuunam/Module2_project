package J04001;

public class Point {
	private double x,y;
	
	public Point() {
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void distance(Point p) {
		double r=Math.sqrt(Math.pow(this.y-p.y, 2)+Math.pow(this.x-p.x, 2));
		System.out.printf("%.4f", r);
		System.out.println();
	}
}