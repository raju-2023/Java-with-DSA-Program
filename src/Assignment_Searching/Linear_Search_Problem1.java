package Assignment_Searching;

import java.util.Scanner;

public class Linear_Search_Problem1 
{

	public static void main(String[] args) 
	{
		
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to add : ");
		m = sc.nextInt();
		
		int []arr = new int[m];
		
		System.out.print("Enter the elements of the array : ");
		
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int element;
		System.out.print("Enter the elements to be searched in array : ");
		element = sc.nextInt();
		
		int idx = -1;
		for(int i=0;i<m;i++)
		{
			if(arr[i] == element)
			{
				idx = 1;
				break;
			}
		}
	
		if(idx != -1) 
		{
			System.out.print("Searched element index number is : "+idx);
		}
		
		else
		{
			System.out.print("Element not found in an array");
		}
	}
}

/*
Output:
	Enter the number of elements you want to add : 5
	Enter the elements of the array : 6 2 3 1 7
	Enter the elements to be searched in array : 2
	Searched element index number is : 1
*/


/*
Output:
	Enter the number of elements you want to add : 5
	Enter the elements of the array : 6 2 3 1 7
	Enter the elements to be searched in array : 5
	Element not found in an array
*/