package Assignment_HashMap_And_Stack;

import java.util.*;

public class HashMap_Problem2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of Key-pair: ");

		int n = sc.nextInt();

		TreeMap<String, Integer> tm = new TreeMap<>();

		System.out.print("Enter the elements in Key and value : ");
		for (int i = 0; i < n; i++) {
			int key = sc.nextInt();
			String value = sc.next();
			tm.put(value, key);
		}

		System.out.println("The value of Map is: " + tm);

	}

}

/*
 * Enter the number of elements of Key-pair: 5 Enter the elements in Key and
 * value : 5 Rahul 7 Lakshman 1 Ram 4 Krish 2 Lakshay The value of Map is:
 * {Krish=4, Lakshay=2, Lakshman=7, Rahul=5, Ram=1}
 */
