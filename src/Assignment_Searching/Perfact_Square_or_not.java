package Assignment_Searching;

import java.util.Scanner;

public class Perfact_Square_or_not 
{
	public static boolean isPerfectSquare(int num)
	{
		if(num == 1) //edge case
		{
			return true;
		}
		long start = 0;//Take long as the input have large value
		long end = num/2;
		while(start <= end)
		{
			long mid = start + (end - start)/2;
			if(mid*mid > num)
			{
				end = mid -1; //mid is greater than the square root of the number
			}
			
			else if(mid * mid < num)
			{
				start = mid + 1; //mid is less than our required number
			}
			else
			{
				return true;  //we found our square root number
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		m = sc.nextInt();
		System.out.print("The given number is a perfect square : "+isPerfectSquare(m));
	}

}

/*
Output:
			Enter the Number : 16
			The given number is a perfect square : true
*/

/*
 Output:
 			Enter the Number : 14
			The given number is a perfect square : false
*/