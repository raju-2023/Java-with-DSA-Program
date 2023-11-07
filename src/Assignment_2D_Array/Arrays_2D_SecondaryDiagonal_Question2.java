package Assignment_2D_Array;

public class Arrays_2D_SecondaryDiagonal_Question2
{

	public static void main(String[] args)
	{
		int[][] arr = {{1,2,3,-1},{4,5,6,-2},{7,8,9,-3},{5,6,8,-4}};
		//m=Number of rows
		//n=Number of coloumns
		int m = arr.length;
		int n = arr.length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				//condition to display elements above the secondary diagonal
				if((i+j)<n-1)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println("  ");
	}

}


//Output:1 2 4 