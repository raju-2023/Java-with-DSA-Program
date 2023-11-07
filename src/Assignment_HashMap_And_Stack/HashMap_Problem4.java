package Assignment_HashMap_And_Stack;

import java.util.*;

public class HashMap_Problem4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements of array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			tm.put(arr[i], 1);
		}
		System.out.println("Largest Element of Map is : " + tm.lastEntry().getKey());
	}
}

/*
Enter the number of elements of array: 5
Enter the elements of array: 4 2 7 1 9
Largest Element of Map is : 9
*/
