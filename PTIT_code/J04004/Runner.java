package J04004;

import java.util.Scanner;

//TỔNG PHÂN SỐ
public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pso p1=new Pso(sc.nextLong(),sc.nextLong());
		Pso p2=new Pso(sc.nextLong(),sc.nextLong());
		p1.tong(p2);
	}
}