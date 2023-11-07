package Assignment_1D_Array;

public class Array_Even_Index_sum_Question1 
{

	public static void main(String[] args) 
	{
		int[] arr = {3,20,4,6,9};
		
		int n = arr.length;
		int i = 0,sum = 0;
		while(i<n)
		{
			sum +=arr[i];
			//addition of even index element
			i +=2;
		}
		System.out.println("The sum of even index elements is: "+sum);
	}

}



  
// Output:The sum of even index elements is: 16
  

 