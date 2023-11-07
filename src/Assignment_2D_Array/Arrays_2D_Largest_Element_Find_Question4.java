package Assignment_2D_Array;
//Time Complexity is-: O(m*n)
//Space Complexity is-:O(1)

public class Arrays_2D_Largest_Element_Find_Question4 
{

	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,4,0},{2,5,7,-1},{4,2,6,9}};
		int m = arr.length;
		int n = arr[0].length;
		
		//logic to find the maximum element in a 2D array
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				max = Math.max(max,arr[i][j]);
			}
		}
		System.out.println("The largest element in a given 2D array is="+max);
	}

}

//Output:The largest element in a given 2D array is=9
