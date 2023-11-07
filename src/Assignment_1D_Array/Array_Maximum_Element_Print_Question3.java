package Assignment_1D_Array;

public class Array_Maximum_Element_Print_Question3 
{

	public static void main(String[] args) 
	{
		int[] arr = {34,21,54,65,43};
		int max = Integer.MIN_VALUE;
		for(int num : arr)
		{
			max = Math.max(max, num);
		}
		System.out.println("The maximum element in a given array is: "+max);
	}

}


//Output:
//			The maximum element in a given array is: 65