package J07058;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		
		Number a=new Number(3);
		Number b=new Number(5);
		System.out.println("Truoc khi doi cho: "+a.getNum()+" "+b.getNum());
		doicho(a, b);
		System.out.println("Sau khi doi cho: "+a.getNum()+" "+b.getNum());
	}
	public static void doicho(Number a,Number b) {
		Number t=a;
		a=b;
		b=t;
		System.out.println("Đổi chỗ trong hàm: "+a.getNum()+" "+b.getNum());
		
	}
}