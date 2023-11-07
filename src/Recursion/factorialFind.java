package Recursion;
import java.util.*;
import java.io.*;
public class factorialFind 
{
	//function definition
    public static int factorialFinding(int n)
    {
        int result = 0;
        //1.Base case condition
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            // 2.Recursive function calling
            result = n*factorialFinding(n-1);
        }
        return result;
    }

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        //function calling
        int result = factorialFinding(n);
        System.out.println("Factorial of a given number is "+result);

	}

}
