package DivideConquer;
public class selectionProcedure {
	//function to do the partion of an array
	public static int partition(int[]arr,int l,int h) 
	{
		int i=l;
		//pivot as the first element in an array
		int pivot = arr[l];
		
		for(int j=l+1;j<=h;j++) 
		{
			//j-to take care of the bigger elements than the pivot
			//i-to take care of the smaller elements than the pivot
			if(arr[j]<= pivot) 
			{
				i = i+1;
				//swap(arr[i],arr[j])
				int tem = arr[i];
				arr[i] 	= arr[j];
				arr[j] 	= tem;
			}
		}
		//swap(arr[l],arr[i])
		//to return the correct index of the pivot element
		int tem = arr[l];
		arr[l] = arr[i];
		arr[i] = tem;
		return i;
	}
	
	//function to implement the kth smallest element finding in an array
	public static int selectionProcedure(int[] arr,int l,int h,int k)
	{
		//1.Divide the array using the partition algorithm
		int m = partition(arr,l,h);
		//relationship between index number and position number
		if(m == k-1)
		{
			return arr[m];
		}
		//traversing towards right side of an array		
		else if(m<k-1)
		{
			//conquer using the recursion
			return selectionProcedure(arr,m+1,h,k);
		}
		//traversing towards left side of an array
		//conquer using the recursion
		else
			return selectionProcedure(arr,l,m-1,k);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {50,20,70,90,10,13,17,21};
		int n = arr.length;
		int k = 5;
		
		//3rd smallest element in an array
		int result = selectionProcedure(arr,0,n-1,k);
		System.out.println("kth smallest element in an array is : "+result);
		
	}
	
}
