package Assignment_Sorting_Array;
import java.util.Scanner;
public class Insertion_Sort_Problem3 
{
	public static void insertionSort(int[] a) 
	{
        int n = a.length;

        for (int i = 1; i < n; i++) 
        {
            int j = i;

            // Insert a[i] into sorted left part 0..i-1
            while (j > 0 && a[j] > a[j - 1]) 
            {

                // Swap a[j] and a[j-1]
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;

                // Decrement j by 1
                j--;
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
        insertionSort(arr);
        System.out.print("Print Array Element in Descending Order(Using Insertion Sort) :  ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
         System.out.print("\n ");
    }
}


/*
Output:
Enter the size of array : 5
Enter the elements of array : 3 5 1 6 0
Print Array Element in Descending Order(Using Insertion Sort) :  6 5 3 1 0 

 */
