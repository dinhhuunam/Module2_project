package StopWatch;

import java.util.Random;
import java.util.Scanner;

//Xây dựng 1 StopWatch đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array lenght: ");
		int length = sc.nextInt();
		int[] randomArray = new int[length];
		Random rdom=new Random();
		for(int i=0;i<length;i++) {
			//fix the range random
			randomArray[i]=rdom.nextInt(1000);
		}
		
		StopWatch coutdown = new StopWatch();
		coutdown.start();
		System.out.println("StartTime: "+coutdown.getStartTime());
		//Thuật toán sắp xếp
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(randomArray[i] > randomArray[j]) {
					int temp = randomArray[i];
					randomArray[i] = randomArray[j];
					randomArray[j] = temp;
				}
			}
		}
		coutdown.end();
		System.out.println("End Time: "+coutdown.getEndTime());
		System.out.println("Total time to process soft mechanic: "+coutdown.getElapsedTime());
	}
}