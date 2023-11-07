package Searching;
public class Last_Occurrence 
{
	// Function to find the last occurrence of a given number
		// in a sorted integer array
		public static int findLastOccurrence(int[] nums, int target)
		{
			// search space is nums[left…right]
			int left = 0;
			int right = nums.length - 1;

			// initialize the result by -1
			int result = -1;

			// loop till the search space is exhausted
			while (left <= right)
			{
				// find the mid-value in the search space and compares it with the target
				int mid = (left + right) / 2;

				// if the target is located, update the result and
				// search towards the right (higher indices)
				if (target == nums[mid])
				{
					result = mid;
					left = mid + 1;
				}

				// if the target is less than the middle element, discard the right half
				else if (target < nums[mid]) {
					right = mid - 1;
				}

				// if the target is more than the middle element, discard the left half
				else {
					left = mid + 1;
				}
			}

			// return the leftmost index, or -1 if the element is not found
			return result;
		}
		
		
		public static void main(String[] args)
		{
			int[] nums = {1,1,1,2,3,4,4,5,6,6,6,6};
			int target = 4;

			int index = findLastOccurrence(nums, target);

			if (index != -1)
			{
				System.out.println("The last occurrence of element " + target +
						" is located at index " + index);
			}
			else 
			{
				System.out.println("Element not found in the array");
			}	 		 
		}
}

