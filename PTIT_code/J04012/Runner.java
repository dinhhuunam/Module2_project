package J04012;

import java.util.Scanner;

//BÀI TOÁN TÍNH CÔNG
public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NV nv=new NV(sc.nextLine(),sc.nextLong(),sc.nextLong(),sc.next());
		nv.solve();
		System.out.println(nv.toString());
	}
}