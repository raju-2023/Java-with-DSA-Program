package GreedyAlgorithms;
//Time Complexity:O(n^2)
//Space Complexity:O(n)
import java.util.ArrayList;
import java.util.Collections;

public class jobScheduling {

	char id;
	int deadline,profit;
	
	public jobScheduling()
	{
		
	}
	
	public jobScheduling(char id,int deadline,int profit)
	{
		this.id = id;
		this.deadline =deadline;
		this.profit = profit;
	}
	
	//function definition-->Greedy Approach
	void printJobSequence(ArrayList<jobScheduling> arr,int maxDeadline)
	{
		int n = arr.size();
		
		//1.Sort the jobs in the decreasing order of profit
		//lamda expression
		//nlog n- MergeSort
		Collections.sort(arr,(a,b)->b.profit-a.profit);
		
		//keep the track of the booked slots
		boolean result[] = new boolean[maxDeadline];
		
		// to store the jobs ids
		char jobs[] = new char[maxDeadline];
		
		//2.to store the jobs ids according to the given deadline
		//O(n^2)
		for(int i=0;i<n;i++)
		{
			
			for(int j=Math.min(maxDeadline-1,arr.get(i).deadline-1);j>=0;j--)
			{
				//if the slot is available - false
				if(result[j] == false)
				{
					result[j] = true;
					
					//allocated that slot to the current job id
					jobs[j] = arr.get(i).id;
					break;
				}
			}
		}
		for(char id:jobs)
		{
			System.out.print(id+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<jobScheduling> arr = new ArrayList<>();
		arr.add(new jobScheduling('1',5,55));
		arr.add(new jobScheduling('2',2,65));
		arr.add(new jobScheduling('3',7,75));
		arr.add(new jobScheduling('4',3,60));
		arr.add(new jobScheduling('5',2,70));
		arr.add(new jobScheduling('6',1,50));
		arr.add(new jobScheduling('7',4,85));
		arr.add(new jobScheduling('8',5,68));
		arr.add(new jobScheduling('9',3,45));
		
		System.out.println("Job Sequences to get the maximum profit is :  ");
		jobScheduling job = new jobScheduling();
		
		//function calling
		job.printJobSequence(arr,7);

	}

}
