package LinkedList;
public class LinkedList_At_The_Beginning 
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
	//Implementation of insertion of a node at the Beginning
	public void insertBeginning(int newData)
	{
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
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
		LinkedList_At_The_Beginning list = new LinkedList_At_The_Beginning();
		list.insertAtEnd(2);
		list.insertAtEnd(4);
		list.insertAtEnd(8);
		
		System.out.println("Before Insertion");
		list.displayLL();
		System.out.println();
		
		list.insertBeginning(1);
		list.insertBeginning(9);
		System.out.println("After Insertion");
		list.displayLL();
		System.out.println();

	}

}
