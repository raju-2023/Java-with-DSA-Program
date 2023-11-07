package Assignment_1D_Array;

public class Array_Second_Largest_Element_Print_Question4 
{

	public static void main(String[] args) 
	{
		
		int[] arr = {34,21,54,65,43};
		//max1=first largest element in an array
		//max2=second largest element in an array
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int num : arr)
		{
			max1 = Math.max(max1, num);
		}
		for(int num : arr)
			//condition makes sure that we are getting the second largest element in an array
		{
			if(num != max1)
			{
				max2 = Math.max(max2, num);
			}
		}
		if(max2 == Integer.MIN_VALUE)
		{
			System.out.println("No second largest element found");
		}
		else 
		{
			System.out.println("The second largest element in a given array is: "+max2);
		}
	}

}

//Output: 
//			The second largest element in a given array is: 54
