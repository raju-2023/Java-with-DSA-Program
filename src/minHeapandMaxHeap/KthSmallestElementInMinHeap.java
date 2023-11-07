package minHeapandMaxHeap;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
public class KthSmallestElementInMinHeap 
{
	public static int findKthSmallest(List<Integer> input, int k)
	{
        // create an empty min-heap and initialize it with all input elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(input);
 
        // pop from min-heap exactly `k-1` times
        while (--k > 0) 
        {
            pq.poll();
        }
        return pq.peek();
    }
	public static void main(String[] args) 
	{
		
		List<Integer> input = Arrays.asList(1,7,8,5,2,6,9);
        int k = 6;
 
        System.out.println("k'th smallest array element is " + findKthSmallest(input, k));
	}

}
