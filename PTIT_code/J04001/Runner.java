package J04001;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			double x=sc.nextDouble(); double y=sc.nextDouble();
			Point p1=new Point(x, y);
			x=sc.nextDouble(); y=sc.nextDouble();
			Point p2=new Point(x, y);
			p1.distance(p2);
		}
	}
}