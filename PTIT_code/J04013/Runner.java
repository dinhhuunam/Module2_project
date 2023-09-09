package J04013;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/J04013/input.txt"));
		Scanner sc=new Scanner(System.in);
//		String ma=sc.next();
//		sc.nextLine();
//		String name=sc.nextLine();
//		double toan=sc.nextDouble();
//		double ly=sc.nextDouble();
//		double hoa=sc.nextDouble();
//		SV sv=new SV(ma,name,toan,ly,hoa);
		SV sv = new SV(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		sv.solve();
		System.out.println(sv.toString());
	}
}