package Assignment_HashMap_And_Stack;

import java.util.*;

public class HashMap_Problem3 {

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

		HashMap<Integer, Integer> tm = new HashMap<>();
		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (tm.containsKey(arr[i])) {
				System.out.println("Yes");
				answer = 1;
				break;
			}
			tm.put(arr[i], 1);
		}

		if (answer == 0)
			System.out.println("No");
	}

}

/*
Enter the number of elements of array: 4
Enter the elements of array: 1 2 3 4 
No
*/

/*
Enter the number of elements of array: 5
Enter the elements of array: 1 2 3 4 1
Yes

*/
