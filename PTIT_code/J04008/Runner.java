package J04008;

import java.util.Scanner;

//CHU VI TAM GIÁC
public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			Point a=new Point(sc.nextDouble(), sc.nextDouble());
			Point b=new Point(sc.nextDouble(), sc.nextDouble());
			Point c=new Point(sc.nextDouble(), sc.nextDouble());
			
			double r1=a.distance(b);
			double r2=b.distance(c);
			double r3=a.distance(c);
			
			if(r1+r2<=r3||r1+r3<=r2||r2+r3<=r1) {
				System.out.println("INVALID");
			}else {
				double cvi=r1+r2+r3;
				System.out.printf("%.3f",cvi);
				System.out.println();
			}
		}
	}
}