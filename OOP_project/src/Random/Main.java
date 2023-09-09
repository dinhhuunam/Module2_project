package Random;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//How to create a array with "n" random integers?
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>(n);
		Random rdom=new Random();
		
		for(int i=0;i<n;i++) {
			//Here - random.nextInt(1000) will generate a random number from the range 0 to 1000. You can fix the range as you want.
			list.add(rdom.nextInt(1000));
		}
		for(Integer x:list) {
			System.out.print(x+" ");
		}
	}
}