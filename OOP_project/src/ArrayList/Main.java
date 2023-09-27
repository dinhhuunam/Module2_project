package ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Available actions:
//0 - to shutdown
//1 - to add item(s) to list
//2 - to remove any items 
//Enter a number for which action you want to do

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<String> groceries = new ArrayList<>();
		while (flag) {
			printActions();
			switch (Integer.parseInt(sc.nextLine())) {
			case 1: {
				addItems(groceries);
				System.out.println(groceries);
				break;
			}
			case 2: {
				removeItems(groceries);
				System.out.println(groceries);
				break;
			}
			default:
				flag = false;
				break;
			}
			groceries.sort(Comparator.naturalOrder());
		}
	}

	private static void addItems(ArrayList<String> groceries) {
		System.out.println("Add items :");
		String[] items = sc.nextLine().split(",");
//		groceries.addAll(List.of(items));

		for (String i : items) {
			String trimmed = i.trim();
			if (groceries.indexOf(trimmed) < 0) {
				groceries.add(trimmed);
			}
		}
	}

	private static void removeItems(ArrayList<String> groceries) {
		while (true) {
			System.out.print("Remove items(s) :");
			String res = sc.next();
			if (groceries.indexOf(res) >= 0) {
				groceries.remove(groceries.indexOf(res));
				sc.nextLine();
				break;
			}
		}
	}

	private static void printActions() {

		String textBlock = "Available actions:\r\n" + "0 - to shutdown\r\n" + "1 - to add item(s) to list\r\n"
				+ "2 - to remove any items \r\n" + "Enter a number for which action you want to do: ";
		System.out.print(textBlock);
	}
}