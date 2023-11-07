package DivideConquer;

public class randomizedQuickSort {

	public static int partition(int[]arr,int l,int h) {
		//generate the random index within an array
		//pivot element is not fixed but now randomly chosen
		int randomIndex = l+(int)Math.random() % (h-l+1);
		
		//swap(arr[randomeIndex],arr[l])
		int temp = arr[randomIndex];
		arr[randomIndex] = arr[l];
		arr[l] = arr[randomIndex];
		
		int i=l;
		//pivot as the first element in an array
		int pivot = arr[l];
		
		for(int j=l+1;j<=h;j++) {
			//j-to take care of the bigger elements than the pivot
			//i-to take care of the smaller elements than the pivot
			if(arr[j]<= pivot) {
				i = i+1;
				//swap(arr[i],arr[j]
				int tem = arr[i];
				arr[i] 	= arr[j];
				arr[j] 	= tem;
			}
		}
		//swap(arr[l],arr[i]
		//to return the correct index of the pivot element
		int tem = arr[l];
		arr[l] = arr[i];
		arr[i] = tem;
		return i;
	}
	public static void quickSort(int[] arr,int l,int h) {
		if(l<h) {
			//1.Divide the array into subproblems
			int m = partition(arr,l,h);
			
			//2.Conquer those subproblems via Recursion
			quickSort(arr,l,m-1);
			quickSort(arr,m+1,h);
			
			//3.No need of combine part
		}
	}
	
	
	public static void printArr(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {50,20,70,90,10,13,17,21};
		int n = arr.length;
		System.out.println("Array before sort is : ");
		printArr(arr,n);
		
		quickSort(arr,0,n-1);
		
		System.out.println("Array after sort is :");
		printArr(arr, n);
	}

}
