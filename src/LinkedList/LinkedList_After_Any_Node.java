package LinkedList;
public class LinkedList_After_Any_Node 
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
	
	//Implementation of insertion of a node after any node
	public void insertAfter(Node prev_node, int newData)
	{
		if(prev_node == null)
		{
			System.out.println("The previous node cannot contain null values");
			return;
		}
		
		Node newNode = new Node(newData);
		newNode.next = prev_node.next;
		prev_node.next = newNode;
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
		LinkedList_After_Any_Node list = new LinkedList_After_Any_Node();
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
		
		list.insertAfter(list.head.next.next, 13);
		list.displayLL();
		System.out.println();


	}

}
