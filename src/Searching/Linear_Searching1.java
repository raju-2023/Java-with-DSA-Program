package Searching;
import java.util.*;
import java.io.*;
//Time Complexity=O(n)
//Space Complexity=O(1)
public class Linear_Searching1 
{

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
	 
	 //Implementation of linear search
	 int idx = -1;
	 for(int i=0;i<n;i++)
	 {
		 if(arr[i] == x)
				 {
			 			idx = i;
			 			break;
				 }
	 }
	 if(idx == -1)
	 {
		 System.out.println("Search element is not found in an array");
	 }
	 else
	 {
		 System.out.println("Searched element at the array index location:"+idx);
	 }
	}

}
