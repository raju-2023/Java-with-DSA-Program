package Hashing_Data_Structure;
/*	Time Complexity:O(n)
	Space Complexity:O(n)
*/
import java.util.*;
public class twoSum
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array= ");
		int n = sc.nextInt();
		
		//input array elements in an array
		int[] arr = new int[n];
		System.out.println("Enter the array elements= ");
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		//input target element in an array
		System.out.println("Enter the target element in an array= ");
		int target = sc.nextInt();
		
		//Create a HashMap where key is arr[i] ans value is i
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(arr[i], i);
		}
		
		//Create a result array to display the index of two numbers
		int result[] = new int[2];
		//if the current elements is equal to the target
		for(int i=0;i<n;i++)
		{
			if(arr[i] == target && map.containsKey(0))
			{
				result[0] = i;
				result[1] = map.get(0);
				break;
			}
			else if(map.containsKey(target - arr[i]))
			{
				//Is the element non-repeatable
				if(map.get(target - arr[i])> i)
				{
					result[0] = i;
					result[1] = map.get(target - arr[i]);
					break;
				}
			}
		}
		System.out.println("Two sum index values are: ["+result[0]+","+result[1]+"]");
	}

}


/*Output:
			Enter the size of an array= 
			 
			4
			Enter the array elements= 
			2 7 11 15
			Enter the target element in an array= 
			9
			Two sum index values are: [0,1]
*/