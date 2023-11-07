package Searching;
import java.util.*;
import java.io.*;
public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] nums = {1, 1, 1, 2, 3, 4, 4, 5 ,6 ,6, 6, 6};
		int target = 4;
		System.out.println(search(nums,target));
	}
	static int search(int[] nums, int target)
	{
		for(int index = 0;index<nums.length; index++)
		{
			if(nums[index] == target)
			{
				return index;
			}
		}
		return -1;
	}

}
