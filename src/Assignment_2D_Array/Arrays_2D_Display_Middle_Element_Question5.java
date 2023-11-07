package Assignment_2D_Array;
//Time Complexity is-: O(m) if n < m or O(n) if m < n 
//Space Complexity is-:O(1)

public class Arrays_2D_Display_Middle_Element_Question5 
{

	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};
		int m = arr.length;
		int n = arr[0].length;
		
		//display of middle column values
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i][n/2]+" ");
		}
		
		//display of middle row values
		for(int j=0;j<n;j++)
		{
			if(j == n/2)
			{
				continue;
			}
			System.out.print(arr[m/2][j]+" ");
		}
		System.out.println(" ");
	}

}

//Output:	3 5 5 6 37 7 6 4 3  
