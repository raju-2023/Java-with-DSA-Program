package Assignment_1D_Array;

public class Array_Peak_Element_Question5 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,4,7,3,2,6,5};
		int n = arr.length;
		for(int i=1;i<n-1;i++)
		{
			if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
			{
				System.out.println(arr[i]);
				break;
			}
		}

	}

}

//Output: 7

