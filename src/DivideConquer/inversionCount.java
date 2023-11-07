package DivideConquer;
import java.util.Arrays;
public class inversionCount {

//function definition inversion count
//brute force approach
	public static int inversionCount(int[] arr,int n){
		int count = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				//property of inversion
				//i<j
				//arr[i]>arr[j]
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	//already taught in merge sort
	//time complexity:O(n)
	//space complexity:O(n)
	public static int mergeProcedure(int[] arr,int l,int mid,int h) {
		int swap = 0;
		//left and right subarray
		int[] lsubarray = Arrays.copyOfRange(arr, l, mid+1);
		int[] rsubarray = Arrays.copyOfRange(arr, mid+1, h+1);
		
		int i = 0, j = 0,k = l;
		while(i<lsubarray.length && j<rsubarray.length) {
			if(lsubarray[i]<=rsubarray[j]) {
				arr[k++] = lsubarray[i++];
			}
			else {
				arr[k++] = rsubarray[j++];
				
				//calculate the number of swaps
				//assignment -how below value is valid to calculate the number of swaps
				swap += (mid+1) - (l+i); 
			}
			
		}
		//copy all the remaining elements from left subarray
		while(i<lsubarray.length) {
			arr[k++] = lsubarray[i++];
		}
		//copy all the remaining elements from right subarray
		while(j<rsubarray.length) {
			arr[k++] = rsubarray[j++];
		}
	return swap;
	}
	
	//count of number of inversions via the divide and conquer approach
	public static int inversionCountDC(int[] arr,int l,int h) {
		int count = 0;
		if(l<h) {
			//1.Divide the array into two subproblems
			int mid = l+(h-l)/2;
			
			//2.Conquer the subproblems using the recursive approach
			//left subarray
			count += inversionCountDC(arr,l,mid);
			//right subarray
			count += inversionCountDC(arr,mid+1,h);
			//3.Combine the solution
			count += mergeProcedure(arr,l,mid,h);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int n = arr.length;
		
		int count = inversionCount(arr,n);
		int countOpt = inversionCountDC(arr,0,n-1);
		
		System.out.println("The inversion count of an array using brute force approach is : "+count);
		System.out.println("The inversion count of an array using divide and conquer approach is : "+countOpt);
	}

}
