package Assignment_Searching;

import java.util.Scanner;

public class Number_Of_One_Problem3 
{
	public static int findNumOfOne(int[]nums,int low,int high)
	{
		while(low<=high)
		{
			int mid = low + (high - low)/2;
			if(nums[mid] == 0)
			{
				low = mid +1;
			}
			else
			{
				high = mid - 1;
			}
		}
		return(nums.length-low);
	}
	public static void main(String[] args) 
	{
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to add : ");
		m = sc.nextInt();
		
		int arr[] = new int[m];
		System.out.print("Enter the elements of the array : ");
		
		for(int i=0;i<m;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("The number of one's in the given array is :  "+findNumOfOne(arr,0,m-1));

	}

}

/*
1st Output:
		Enter the number of elements you want to add : 10
		Enter the elements of the array : 0 0 0 0 1 1 1 1 1 1
		The number of one's in the given array is :  6



2nd Output:
		Enter the number of elements you want to add : 7
		Enter the elements of the array : 0 0 0 0 0 1 1
		The number of one's in the given array is :  2
*/