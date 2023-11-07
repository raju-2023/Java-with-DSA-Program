package Assignment_2D_Array;
import java.util.*;
import java.sql.Array;
public class Arrays_2D_CountValues_Question1
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		
		int m = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int n = sc.nextInt();
		
		//2D array initialization
		int[][] arr = new int[m][n];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt(); 
			}
		}
		
		//logic of finding the total number of elements positive,negative,even,odd and zeros
		int positive = 0, negative = 0, even = 0,odd = 0,zeros = 0;
		//traverse array
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				//1. positive elements
				if(arr[i][j] > 0 )
				{
					positive++;
				}
				
				//2.Negative elements
				if(arr[i][j]<0)
				{
					negative++;
				}
				
				//3.even elements
				if(arr[i][j]%2 == 0)
				{
					even++;
				}
				
				//4.Odd elements
				if((arr[i][j]%2) != 0)
				{
					odd++;
				}
				//2.Zeros elements
				if(arr[i][j] == 0)
				{
					zeros++;
				}
			}
		}
		System.out.println("The total number of positive elements= "+positive);
		System.out.println("The total number of negative elements= "+negative);
		System.out.println("The total number of even elements= "+even);
		System.out.println("The total number of odd elements= "+odd);
		System.out.println("The total number of zeros elements= "+zeros);		
	}
}
/*  Output:
  
				Enter the number of rows: 
				4
				Enter the number of columns: 
				4
				Enter the array elements: 
				1 2 -3 4
				0 0 -4 2
				1 -1 2 3
				-4 -5 -7 0
				The total number of positive elements= 7
				The total number of negative elements= 6
				The total number of even elements= 9
				The total number of odd elements= 7
				The total number of zeros elements= 3

 */
