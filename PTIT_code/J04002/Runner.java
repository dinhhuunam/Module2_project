package J04002;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double cdai=sc.nextDouble();
		double crong=sc.nextDouble();
		if(cdai<=0 || crong<=0) {
			System.out.println("INVALID");
		}else {
//			StringBuilder s=new StringBuilder(sc.next());
			String s=sc.next();
			Rectange p=new Rectange(cdai, crong, s);
			System.out.println(p.findPerimeter()+" "+p.findArea()+" "+p.getColor());
		}
	}
}