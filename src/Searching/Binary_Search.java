package Searching;
//Time Complexity=O(log n)
//Space Complexity=O(1)
import java.util.*;
import java.io.*;
public class Binary_Search 
{
	public static int binarySearch(int[] arr,int target)
	{
		int low=0, high = arr.length-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		return 0;
	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		 //size of an element from the user
		 System.out.println("Enter the number of Elements present in an array");
		 int n = sc.nextInt();
		 
		 //array elememts entered from the user
		 System.out.println("Enter the array Element");
		 int[] arr = new int[n];
		 
		 for(int i=0;i<n;i++)
		 {
			 arr[i] = sc.nextInt();
		 }
				 
		 //target element from the user
		 System.out.println("Enter target Element");
		 int x = sc.nextInt();
		 
		 //Function Calling of Binary search
		 int result = binarySearch(arr, x);
		 if(result == 0)
		 {
			 System.out.println("Search element is not found in an array");
		 }
		 else
		 {
			 System.out.println("Searched element at the location:"+result);
		 }

	}

}
