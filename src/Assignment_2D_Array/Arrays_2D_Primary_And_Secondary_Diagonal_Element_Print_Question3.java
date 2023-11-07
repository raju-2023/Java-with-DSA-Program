package Assignment_2D_Array;
//1. Brute Force Approach
//Time Complexity:O(n^2)
//Space Complexity:O(1)

//2. Optimized Approach
//Time Complexity:O(n)
//Space Complexity:O(1)
public class Arrays_2D_Primary_And_Secondary_Diagonal_Element_Print_Question3
{

	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int m = arr.length;
		
		/*
		//approach to display the diagonal element
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				//check for the primary diagonal elements
				if(i == j)
				{
					System.out.print(arr[i][j] +" ");
				}
				//check for the secondary diagonal elements
				else if((i+j) == arr[0].length-1)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
*/
		for(int i=0;i<m;i++)
		{
			//primary element in the give 2D Matrix
			System.out.print(arr[i][i]+" ");
			
			//secondary element in the give 2D Matrix
			//below check is to avoid the display of the middle element twice
			if(i != m-1-i)
			{
				System.out.print(arr[i][m-1-i]+" ");
			}
		}
		System.out.println(" ");

	}

}

//First Approach  Output:1 3 5 7 9 
//Second Approach Output:1 3 5 9 7 
