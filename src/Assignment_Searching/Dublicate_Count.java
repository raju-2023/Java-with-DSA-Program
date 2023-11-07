package Assignment_Searching;

import java.util.Scanner;

public class Dublicate_Count 
{
	public static int lastOccurrence(int[]a,int low,int high,int target)
	{
		int answer = -1;
		while(low <= high)
		{
			int mid = low +(high - low)/2;
			if(a[mid] == target)
			{
				answer = mid;
				low = mid + 1;
				/* If you found the target or if target is greater than the currentt element, 
				 to find last occurrence move to right half of the array*/
			}
			else if(a[mid]> target)
			{
				high = mid -1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return answer;
	}
	public static int firstOccurrence(int[]a, int low,int high,int target)
	{
		int answer = -1;
		while(low <= high)
		{
			int mid = (low + high)/2;
			if(a[mid] == target)
			{
				answer = mid;
				high = mid - 1;
				/*Trying to find the minimum index at which value X is present */
			}
			else if(a[mid] > target)
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return answer;
	}
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
		
		int target;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the Target :" );
		target = sc1.nextInt();
		
		int first = firstOccurrence(arr,0,m-1,target);
		int last = lastOccurrence(arr,0,m-1,target);
		
		if(first == last && first == -1)
		{
			System.out.print("The target does not exist in the array.");
		}
		else
		{
			System.out.print("The frequency of target in the gven array is : "+(last - first+1)+" time/times");
		}

	}

}

/*
Output:
		Enter the number of elements you want to add : 10
		Enter the elements of the array : 2 5 5 5 6 6 8 9 9 9
		Enter the Target :5
		The frequency of target in the gven array is : 3 time/times
*/

/*
Output:
		Enter the number of elements you want to add : 10
		Enter the elements of the array : 2 5 5 5 6 6 8 9 9 9
		Enter the Target :6
		The frequency of target in the gven array is : 2 time/times
*/