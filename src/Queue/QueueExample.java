package Queue;
import java.util.*;
public class QueueExample 
{

	public static void main(String[] args) 
	{
		Queue<String> q1 = new LinkedList<>();
		
		//add() method:Add elememt in the queue
		q1.add("one");
		q1.add("Two");
		q1.add("Three");
		q1.add("Four");
		System.out.println(q1);
		
		//remove() method: To remove the element in the queue
		q1.remove("Three");
		System.out.println(q1);
		
		//size() method: To show size of queue(int value result show)
		System.out.println("Queue size: "+q1.size());
		
		//contains() method:The element contains in the queue to show boolean result true/false
        
		System.out.println("Queue Contains element 'Two' or not? : "+q1.contains("Two"));
		
		//clear() method: These method is used to empty the queue
		q1.clear();
		System.out.println(q1);
	}

}
