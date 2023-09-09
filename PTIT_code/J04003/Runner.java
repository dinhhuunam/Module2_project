package J04003;

import java.util.Scanner;

//PHÂN SỐ
public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long y=sc.nextLong();
		if(x>0 && y>0) {
			PSo p=new PSo(x, y);
			p.rutGon();
			System.out.println(p.toString());
		}
	}
}