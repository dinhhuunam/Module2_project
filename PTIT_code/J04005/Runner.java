package J04005;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String date=sc.next();
		double x=sc.nextDouble(), y=sc.nextDouble(), z=sc.nextDouble();
		Student st=new Student(name, date, x, y, z);
		System.out.print(st.toString());
		st.thongTin();
	}
}