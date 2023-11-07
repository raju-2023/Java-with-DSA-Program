package Queue;
import java.util.*;

public class DequeImplement 
{

	public static void main(String[] args) 
	{
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(5);
		deque.addFirst(7);
		deque.addFirst(9);
		
		System.out.println("Deque Output Looks Like: "+deque);
		deque.removeFirst();
		System.out.println("Deque ouput looks like after deletion:" +deque);

	}

}
