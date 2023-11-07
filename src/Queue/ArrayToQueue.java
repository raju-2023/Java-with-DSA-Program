/*  To convert a Java array to Queue using “Collections.addAll()” method*/
package Queue;
import java.util.*;
public class ArrayToQueue 
{

	public static void main(String[] args) 
	{
		String nums[] = {"one","two","three","four","five"};
		Queue<String> q1 = new LinkedList<>();
		
		
		Collections.addAll(q1,nums);//these method convert array to queue
		System.out.println(q1);
	}
}


//Output:[one, two, three, four, five]