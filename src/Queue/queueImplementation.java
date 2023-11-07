package Queue;
//Implementation of the functions available in the queue data structure in Java

import java.util.*;

public class queueImplementation 
{

	public static void main(String[] args) 
	{
		Queue<Integer> q = new LinkedList<>();
		//To add the data inside the queue
		for(int i=0;i<10;i++)
		{
			q.add(i);
		}
		System.out.println("Queue data looks like: "+q);
		
		//To display the top element present in the queue
		System.out.println("The top element in the queue before deletion is: "+q.peek());
		
		//To remove the element from the queue- dequeue
		q.remove();
		
		//To display the top element present in the queue
		System.out.println("The top element in the queue after deletion is: "+q.peek());
		
		//To check the size of the queue
		System.out.println("The current size of the queue is: "+q.size());
	}

}
