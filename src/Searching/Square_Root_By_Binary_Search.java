//Approach: Modification of Binary Search
//Time complexity=O(log n
//Space compleity=O(1)
package Searching;
import java.util.*;
import java.io.*;
public class Square_Root_By_Binary_Search
{

		public static int findSquareRoot(int num)
		{
			int low=0,high=num,result=-1;
			
			//modification of binary search
			while(low<=high)
			{
				int mid = low+(high-low)/2;
				long val = mid*mid;
				
				if(val == num)
				{
					//perfect square root
					return mid;
				}
				else if(val<num)
				{
					//store the floor value, incase the number is not perfect square root, we can print the floor value
					result = mid;
					low = mid+1;
				}
				else
				{
					high = mid-1;
				}
				
			}
			return result;
		}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you want the square root: ");
		int num = sc.nextInt();
		
		//function calling
		int result = findSquareRoot(num);
		System.out.println("Square root of the given number is: "+result);
		
		

	}

}
