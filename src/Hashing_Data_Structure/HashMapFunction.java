package Hashing_Data_Structure;
import java.io.*;
import java.util.*;

public class HashMapFunction 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String>hashmap = new HashMap<>();
		//Functionality of the put() function
		hashmap.put(1, "Priya");
		hashmap.put(3, "Asha");
		hashmap.put(5, "Karan");
		hashmap.put(8, "Astha");
		
		System.out.println("HashMap of the given data is: "+hashmap);
		
		//Functionality of the get() function
		String result = hashmap.get(3);
		System.out.println("Value for the given key is: "+result);
		
		//Functionality of the containsKey() function
		System.out.println(hashmap.containsKey(2));
		
		//Functionality of the remove() function
		hashmap.remove(1);
		System.out.println("Updated hashmap: "+hashmap);
		
		//iterating using the for loop
		for(Map.Entry<Integer,String> e: hashmap.entrySet())
		{
			System.out.println("Hashmap is: ");
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}

}


