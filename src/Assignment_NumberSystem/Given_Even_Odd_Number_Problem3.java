package Assignment_NumberSystem;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Given_Even_Odd_Number_Problem3 
{
	public static void main(String[] args) {
		int number;
		 System.out.println("Enter the integer: ");
 
        // Create Scanner object
        Scanner s = new Scanner(System.in);
 
        // Read the next integer from the screen
        number = s.nextInt();
        
        if((number & 1) == 1)
        {
        	System.out.println("Given number is odd.");
        }	
        else
        {
        	System.out.println("Given number is even.");
        }        	
	}
}


/*
Output:
Enter the integer: 
5
Given number is odd.
*/

/*
Enter the integer: 
6
Given number is even.
*/