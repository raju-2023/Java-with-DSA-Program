package LinkedList;
public class Middle_of_a_LinkedList 
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
	
	//Implementation of deletion of a node link list

	void deleteNode(int position)
	{
		//linkedlist is empty
		if(head == null)
		{
			return;
		}
		Node temp = head;
		//deletion is in the beginning of the node
		if(position == 0)
		{
			head = temp.next;
			return;
		}
		
		//deletion is not in the beginning of the node
		for(int i=0;temp != null && i<position-1;i++)
		{
			temp = temp.next;
		}
		if(temp == null && temp.next == null)
		{
			return;
		}
		
		temp.next = temp.next.next;
	}
	
	//Implementation of reversal of a node in a linked list
	public void reverseLL() 
	{
		Node curr = head;
		Node prev = null;
		Node nextPtr = null;
		
		while(curr != null)
		{
			nextPtr = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextPtr;
		}
		
		head = prev;
		return;
	}
	
	//Implementation of reversal of a linked list using recursive approach
	public void reversalRec(Node curr, Node prev)
	{
		//last node of a linked list
		if(curr.next == null)
		{
			head = curr;
			curr.next = prev;
			return;
		}
		
		Node nextPtr = curr.next;
		curr.next = prev;
		//recursive function call
		reversalRec(nextPtr,curr);
	}
	
	//Implementation of finding of middle data in a linked list
	public void middleNode()
	{
		Node slow = head, fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Middle data of a given linked list is: "+slow.data);
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
	
		Middle_of_a_LinkedList list = new Middle_of_a_LinkedList();
		list.insertAtEnd(2);
		list.insertAtEnd(4);
		list.insertAtEnd(8);
		list.insertAtEnd(70);
		list.insertAtEnd(65);
		list.insertAtEnd(30);
		
		
		
		System.out.println("Even Linked List");
		list.displayLL();
		System.out.println();
		list.middleNode();
		System.out.println();
		System.out.println("*********************************************");
		
		list.insertBeginning(61);
		System.out.println("Odd Linked List");
		list.displayLL();
		System.out.println();
		list.middleNode();
		System.out.println();
	}

}
