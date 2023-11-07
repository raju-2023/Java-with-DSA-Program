package minHeapandMaxHeap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
public class KthSmallestElementInMaxHeap 
{
	public static int findKthSmallest(List<Integer> input, int k)
	{
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(input.subList(0, k));
 
        for (int i = k; i < input.size(); i++)
        {
            // if the current element is less than the root of the heap
            if (input.get(i) < pq.peek()){
                // replace root with the current element
                pq.poll();
                pq.add(input.get(i));
            }
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
