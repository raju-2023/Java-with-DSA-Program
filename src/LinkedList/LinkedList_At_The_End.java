package LinkedList;

public class LinkedList_At_The_End

{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	//Implementation of insertion of a node at the end
	public void insertAtEnd(int newData)
	{
		Node newNode = new Node(newData);
		
		//Linked list is Empty
		if(head == null)
		{
			head = new Node(newData);
			return;
		}
		
		//Linked List is not Empty
		newNode.next = null;
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
			
		}
		
		temp.next = newNode;
		return;
	}
	
	//Implementation of displaying the linkedlist
	public void displayLL()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	public static void main(String[] args) 
	{
		LinkedList_At_The_End list = new LinkedList_At_The_End();
		list.insertAtEnd(2);
		list.insertAtEnd(4);
		list.insertAtEnd(8);
		list.insertAtEnd(12);
		list.insertAtEnd(14);
		
		System.out.println("Before Insertion of 10");
		list.displayLL();
		System.out.println();
		System.out.println("***************************************");
		
		list.insertAtEnd(10);
		System.out.println("After Insertion of 10");
		list.displayLL();
		System.out.println();
	}
}
