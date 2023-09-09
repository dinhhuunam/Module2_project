package Fan;

import java.util.Scanner;

//Luyện tập sử dụng lớp và đối tượng
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Create object fanNo1 and setup information
		Fan fan1=new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println(fan1.toString());
		
		//Create object fanNo2 and setup information
		Fan fan2=new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		System.out.println(fan2.toString());
	}
}