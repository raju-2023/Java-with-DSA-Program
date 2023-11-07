package Assignment_Searching;

import java.util.Scanner;

public class Last_Occurrence_Problem2 
{
	public static int lastOccurrence(int[]nums,int low,int high,int target)
	{
		int answer = -1;
		
		while(low<=high)
		{
			int mid = low+(high-low)/2;
			if(nums[mid] == target)
			{
				answer = mid;
				low = mid+1;
				/*If you found the target or if target 
				is greater than the current element, 
				to find last occurrence move to right 
				half of the array*/
			}
			else if(nums[mid]>target)
			{
				high = mid -1;
			}
			else
			{
				low = mid+1;
			}
		}
		return answer;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to add  :  ");
		int m = sc.nextInt();
		
		
		int arr[] = new int[m];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target : ");
		
		int target;
		Scanner sc1 = new Scanner(System.in);
		target = sc1.nextInt();
		
		System.out.print("The Last Occurrence of Target is at Index : "+lastOccurrence(arr,0,m-1,target));
	}

}

/*
Output:
		Enter the number of elements you want to add  :  12
		Enter the elements of the array : 1 1 1 2 3 4 4 5 6 6 6 6
		Enter the target : 4
		The Last Occurrence of Target is at Index : 6
*/


/*
Output:
	
		Enter the number of elements you want to add  :  10
		Enter the elements of the array : 2 2 2 6 6 18 29 30 30 30
		Enter the target : 15
		The Last Occurrence of Target is at Index : -1
*/