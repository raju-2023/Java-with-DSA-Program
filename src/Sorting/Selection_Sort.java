package Sorting;
//time complexity=O(n^2)
//Space Complexity=O(1)
import java.util.*;

public class Selection_Sort 
{

	public static void selectionSort(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			// min_idx is taking the index of minimum element at every iteration
			int min_idx = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx = j;
				}
			}
			if(min_idx !=i)
			{
				//swap betwwen arr[min_idx] and arr[i]
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {20,50,12,17,19,25,97,16};
		//function calling
		selectionSort(arr);
		System.out.println("Sorted Array is: ");
		System.out.println(Arrays.toString(arr));
	}

}
