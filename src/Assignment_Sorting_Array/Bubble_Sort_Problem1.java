package Assignment_Sorting_Array;
import java.util.Scanner;
public class Bubble_Sort_Problem1 
{
	 // 0 based indexing used
    public static void bubbleSort(int[] a) 
    {
        int n = a.length;

        for (int i = 0; i < n; i++) 
        {
            boolean flag = false;

            for (int j = 0; j < n - i - 1; j++) 
            {
                if (a[j] < a[j + 1]) 
                {
                    flag = true;
                    // swap the values of a[j] and a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            
            // No Swapping happened, array is sorted
            if (!flag) 
            {
                return;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("Print Array Element in Descending Order(Using Bubble Sort) :  ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
Output:
			Enter the size of array : 5
			Enter the elements of array : 3 5 1 6 0
			Print Array Element in Descending Order(Using Bubble Sort) :  6 5 3 1 0
*/ 